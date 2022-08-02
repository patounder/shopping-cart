package com.globant.shoppingcart.service;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public Cart getCartWith(String sessionId){
        return shoppingCartRepository.findBy(sessionId);
    }

}
