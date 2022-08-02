package com.globant.shoppingcart.repository;

import com.globant.shoppingcart.dto.Cart;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ShoppingCartRepository {

    public Cart findBy(String sessionId){
        return new Cart(sessionId, new ArrayList<>());
    }
}
