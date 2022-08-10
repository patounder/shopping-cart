package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    //TODO associate id (sku) with cart (session-id)
    @OneToMany
    @JoinColumn(name = "order_detail_id")
    private List<OrderDetailEntity> orderDetailList;

    public CartEntity(String sessionId, LocalDateTime orderDate, List<OrderDetailEntity> orderDetailList) {
        this.sessionId = sessionId;
        this.orderDate = orderDate;
        this.orderDetailList = orderDetailList;
    }
}
