package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ItemDTO {
    private String sku;
    private String name;
    private float salePrice;
    public ItemDTO(String sku, String name, float salePrice) {
        this.sku = sku;
        this.name = name;
        this.salePrice = salePrice;
    }
}