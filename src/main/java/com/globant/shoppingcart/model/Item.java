package com.globant.shoppingcart.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class Item {

    @Id
    private String sku;

    private String name;

    private float price;

    @OneToMany(mappedBy = "item")
    private List<ItemOrder> itemOrderDetailsList;
    public Item(String sku, String name, float price, List<ItemOrder> itemOrderDetailsList) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.itemOrderDetailsList = itemOrderDetailsList;
    }
}
