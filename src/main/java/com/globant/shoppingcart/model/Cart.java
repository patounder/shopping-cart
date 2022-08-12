package com.globant.shoppingcart.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class Cart {
    @Id
    private String sessionId;
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "cart")
    private List<ItemOrder> itemOrderList;

    public Cart(String sessionId, LocalDateTime orderDate, List<ItemOrder> itemOrderList) {
        this.sessionId = sessionId;
        this.orderDate = orderDate;
        this.itemOrderList = itemOrderList;
    }
}
