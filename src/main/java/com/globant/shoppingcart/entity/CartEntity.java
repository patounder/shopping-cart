package com.globant.shoppingcart.entity;

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
@Entity
@NoArgsConstructor
@Builder
public class CartEntity {
    @Id
    private String sessionId;
    private LocalDateTime orderDate;

    @OneToMany
    private List<ItemEntity> itemList; //TODO associate id (sku) with cart (session-id)
    public CartEntity(String sessionId, LocalDateTime orderDate, List<ItemEntity> itemList) {
        this.sessionId = sessionId;
        this.orderDate = orderDate;
        this.itemList = itemList;
    }
}
