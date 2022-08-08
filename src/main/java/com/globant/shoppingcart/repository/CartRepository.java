package com.globant.shoppingcart.repository;

import com.globant.shoppingcart.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends CrudRepository<CartEntity, Long> {

    public CartEntity findBySessionId(String sessionId);
}
