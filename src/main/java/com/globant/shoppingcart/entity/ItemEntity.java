package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Builder
public class ItemEntity {

    @Id
    private String sku;

    private String name;

    private float price;

    public ItemEntity(String sku, String name, float price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }
}
