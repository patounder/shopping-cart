package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Builder
public class CartEntity {
    @Id
    private String sessionId;
    private LocalDateTime startDate;
    private LocalDateTime orderDate;

    public CartEntity(String sessionId, LocalDateTime startDate, LocalDateTime orderDate) {
        this.sessionId = sessionId;
        this.startDate = startDate;
        this.orderDate = orderDate;
    }
}
