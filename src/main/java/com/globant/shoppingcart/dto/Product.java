package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Product {
    private String sku;
    private float salePrice;

    public Product(String sku, float salePrice) {
        this.sku = sku;
        this.salePrice = salePrice;
    }
}
