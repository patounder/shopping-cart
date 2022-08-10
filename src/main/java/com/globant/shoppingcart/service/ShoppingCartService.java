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
                .orderDate(null)
                .build();

        return initCart;
    }


    public Cart save(Cart updateCart){
        CartEntity entity = new CartEntity(updateCart.getSessionId(), LocalDateTime.now(), null);
        cartRepository.save(entity);
        //TODO catch when duplicated session-id
        return Cart.builder().sessionId(entity.getSessionId()).orderDate(entity.getOrderDate()).build();
    }
}
