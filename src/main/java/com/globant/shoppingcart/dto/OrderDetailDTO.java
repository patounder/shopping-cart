package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class OrderDetailDTO {

    private Long id;
    private int quantity;
    private ItemDTO item;

    public OrderDetailDTO(Long id, int quantity, ItemDTO item) {
        this.id = id;
        this.quantity = quantity;
        this.item = item;
    }
}
