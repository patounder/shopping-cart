package com.globant.shoppingcart.service;

import com.globant.shoppingcart.model.Cart;
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

    public com.globant.shoppingcart.dto.Cart getCartWithSessionId(String sessionId){

        com.globant.shoppingcart.dto.Cart initCart = com.globant.shoppingcart.dto.Cart.builder()
                .sessionId(sessionId)
                .itemList(new LinkedList<>())
                .orderDate(null)
                .build();

        return initCart;
    }


    public com.globant.shoppingcart.dto.Cart save(com.globant.shoppingcart.dto.Cart updateCart){
        Cart entity = new Cart(updateCart.getSessionId(), LocalDateTime.now(), null);
        cartRepository.save(entity);
        //TODO catch when duplicated session-id
        return com.globant.shoppingcart.dto.Cart.builder().sessionId(entity.getSessionId()).orderDate(entity.getOrderDate()).build();
    }
}
