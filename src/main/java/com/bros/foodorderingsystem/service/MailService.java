package com.bros.foodorderingsystem.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendOtpMail(String to, String subject, String body) {
        log.info("Sending mail to {}", to);

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("noreply@foodies.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);

        log.info(subject);
        log.info(to);
        log.info(body);

        //Uncomment to send mail
        javaMailSender.send(simpleMailMessage);
    }


}
