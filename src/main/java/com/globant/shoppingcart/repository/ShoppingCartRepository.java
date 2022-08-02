package com.globant.shoppingcart.repository;

import com.globant.shoppingcart.dto.Cart;
import org.springframework.stereotype.Repository;

@Repository
public class ShoppingCartRepository {

    public Cart findBy(String sessionId){
        return new Cart(sessionId);
    }
}
