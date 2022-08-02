package com.globant.shoppingcart.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Cart {

    private String sessionId;
    private List<Product> productList;

    public Cart(String sessionId, List<Product> productList) {
        this.sessionId = sessionId;
        this.productList = productList;
    }

}
