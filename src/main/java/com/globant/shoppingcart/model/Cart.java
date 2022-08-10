package com.globant.shoppingcart.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    private List<OrderDetail> orderDetailList;

    public Cart(String sessionId, LocalDateTime orderDate, List<OrderDetail> orderDetailList) {
        this.sessionId = sessionId;
        this.orderDate = orderDate;
        this.orderDetailList = orderDetailList;
    }
}
