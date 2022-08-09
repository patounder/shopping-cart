package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Item {
    private String sku;
    private String name;
    private float salePrice;
    private int quantity;

    public Item(String sku, String name, float salePrice, int quantity) {
        this.sku = sku;
        this.name = name;
        this.salePrice = salePrice;
        this.quantity = quantity;
    }
}