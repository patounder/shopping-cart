package com.globant.shoppingcart.service;

import com.globant.shoppingcart.dto.CartDTO;
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

    public CartDTO getCartWithSessionId(String sessionId){

        CartDTO initCartDTO = CartDTO.builder()
                .sessionId(sessionId)
                .orderDetailList(null)
                .orderDate(null)
                .build();

        return initCartDTO;
    }

    public CartDTO save(CartDTO updateCartDTO){
        Cart entity = new Cart(updateCartDTO.getSessionId(), LocalDateTime.now(), updateCartDTO.getOrderDetailList());
        Cart response = cartRepository.save(entity);

        return CartDTO.builder().sessionId(response.getSessionId()).orderDate(response.getOrderDate()).orderDetailList(response.getOrderDetailList()).status(null).build();
    }
}
