package com.globant.shoppingcart.service;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.LinkedList;

@Service
public class ShoppingCartService {

    ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public Cart getCartWith(String sessionId){

        Cart initCart = Cart.builder()
                .sessionId(sessionId)
                .productList(new LinkedList<>())
                .startDate(LocalDateTime.now())
                .orderDate(null)
                .build();

        return initCart;
    }

}
