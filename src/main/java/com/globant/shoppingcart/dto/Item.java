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
    private float salePrice;

    private int quantity;

    public Item(String sku, float salePrice, int quantity) {
        this.sku = sku;
        this.salePrice = salePrice;
    }
}
