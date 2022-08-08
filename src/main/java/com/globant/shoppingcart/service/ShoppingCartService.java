package com.globant.shoppingcart.service;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.entity.CartEntity;
import com.globant.shoppingcart.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;

@Service
public class ShoppingCartService {

    CartRepository cartRepository;

    public ShoppingCartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart getCartWithSessionId(String sessionId){

        Cart initCart = Cart.builder()
                .sessionId(sessionId)
                .itemList(new LinkedList<>())
                .startDate(LocalDateTime.now())
                .orderDate(null)
                .build();

        return initCart;
    }


    public Cart save(Cart updateCart){
        CartEntity entity = new CartEntity("sessionIdApp", LocalDateTime.now(), LocalDateTime.now());
        cartRepository.save(entity);
        Cart cartResponse = Cart.builder().sessionId(entity.getSessionId())
                .startDate(entity.getStartDate()).orderDate(entity.getOrderDate()).build();
        return cartResponse;
    }
}
