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
public class OrderDetail {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cart cart;

    private int quantity;

    public OrderDetail(Long id, Cart cart, int quantity) {
        this.id = id;
        this.cart = cart;
        this.quantity = quantity;
    }
}
