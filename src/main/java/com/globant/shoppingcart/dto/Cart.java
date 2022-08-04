package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Cart {

    private String sessionId;
    private List<Item> itemList;
    private LocalDateTime startDate;
    private LocalDateTime orderDate;

    private Status status;

    public Cart(String sessionId, List<Item> itemList, LocalDateTime startDate, LocalDateTime orderDate, Status status) {
        this.sessionId = sessionId;
        this.itemList = itemList;
        this.startDate = startDate;
        this.orderDate = orderDate;
        this.status = status;
    }
}
