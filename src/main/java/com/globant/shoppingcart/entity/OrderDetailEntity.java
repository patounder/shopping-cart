package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Builder
public class OrderDetailEntity {

    @Id
    private long id;

    @ManyToOne
    private CartEntity cart;

    @ManyToOne
    private ItemEntity item;

    private int quantity;

    public OrderDetailEntity(long id, CartEntity cart, ItemEntity item, int quantity) {
        this.id = id;
        this.cart = cart;
        this.item = item;
        this.quantity = quantity;
    }
}
