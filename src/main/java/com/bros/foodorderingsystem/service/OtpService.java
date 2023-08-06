package com.bros.foodorderingsystem.service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

@Service
public class OtpService {

    private static final int TIME_TO_LIVE = 5;
    private static final String NUMERIC_CHARS = "0123456789";
    private static final int LENGTH = 6;

    private LoadingCache<String, Integer> otpCache;

    public OtpService() {
        super();
        otpCache = CacheBuilder.newBuilder().
            expireAfterWrite(TIME_TO_LIVE, TimeUnit.MINUTES)
            .build(new CacheLoader<>() {
                public Integer load(String key) {
                    return 0;
                }
            });
    }

    public String getOtp() {
        String otp = generateOTP();
        otpCache.put(otp, 0);
        return otp;
    }


    private String generateOTP() {
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(NUMERIC_CHARS.length());
            otp.append(NUMERIC_CHARS.charAt(index));
        }

        return otp.toString();
    }


}
