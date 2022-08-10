package com.globant.shoppingcart.repository;

import com.globant.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {

    public Cart findBySessionId(String sessionId);
}
