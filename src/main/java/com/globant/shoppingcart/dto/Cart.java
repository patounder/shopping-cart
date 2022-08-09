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
    private LocalDateTime createDate;
    private LocalDateTime orderDate;

    private Status status;

    public Cart(String sessionId, List<Item> itemList, LocalDateTime createDate, LocalDateTime orderDate, Status status) {
        this.sessionId = sessionId;
        this.itemList = itemList;
        this.createDate = createDate;
        this.orderDate = orderDate;
        this.status = status;
    }
}
