package com.bros.foodorderingsystem.service;

import com.bros.foodorderingsystem.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;



}
