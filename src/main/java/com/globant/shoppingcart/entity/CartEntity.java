package com.globant.shoppingcart.entity;


import com.globant.shoppingcart.dto.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class CartEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String sessionId;
    private LocalDateTime startDate;
    private LocalDateTime orderDate;

    public CartEntity(String sessionId, LocalDateTime startDate, LocalDateTime orderDate) {
        this.sessionId = sessionId;
        this.startDate = startDate;
        this.orderDate = orderDate;
    }
}
