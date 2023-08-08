package com.bros.foodorderingsystem.service;

import com.bros.foodorderingsystem.api.request.CreateItemRequest;
import com.bros.foodorderingsystem.api.response.CreateItemResponse;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.model.tables.pojos.Item;
import com.bros.foodorderingsystem.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public CreateItemResponse createItem(CreateItemRequest createItemRequest) throws ApplicationError {
        Item item;

        try {
            item = itemRepository.createItem(createItemRequest);
        } catch (ApplicationError e) {
            throw e;
        }

        return CreateItemResponse.builder()
            .itemId(item.getId().toString())
            .name(item.getName())
            .description(item.getDescription())
            .build();
    }

}
