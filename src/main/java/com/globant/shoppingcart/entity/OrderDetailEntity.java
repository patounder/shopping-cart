package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Builder
public class OrderDetailEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private CartEntity cart;

    private int quantity;

    public OrderDetailEntity(Long id, CartEntity cart, int quantity) {
        this.id = id;
        this.cart = cart;
        this.quantity = quantity;
    }
}
