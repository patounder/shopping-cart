package com.globant.shoppingcart.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class ItemOrder {

    @Id
    @GeneratedValue
    private Long id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_session_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "item_sku")
    private Item item;

    public ItemOrder(Long id, int quantity, Cart cart, Item item) {
        this.id = id;
        this.quantity = quantity;
        this.cart = cart;
        this.item = item;
    }
}
