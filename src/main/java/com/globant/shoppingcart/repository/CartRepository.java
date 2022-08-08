package com.globant.shoppingcart.repository;

import com.globant.shoppingcart.dto.Cart;
import com.globant.shoppingcart.dto.Status;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public class CartRepository {

    public Cart findBy(String sessionId){
        return new Cart(sessionId, new ArrayList<>(), LocalDateTime.now(), LocalDateTime.now(), Status.ACTIVE);
    }
}
