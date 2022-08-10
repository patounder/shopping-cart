package com.globant.shoppingcart.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    private List<OrderDetail> orderDetailsList;
    public Item(String sku, String name, float price, List<OrderDetail> orderDetailsList) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.orderDetailsList = orderDetailsList;
    }
}
