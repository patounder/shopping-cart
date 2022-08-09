package com.globant.shoppingcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
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
    private LocalDateTime createDate;
    private LocalDateTime orderDate;

    public CartEntity(String sessionId, LocalDateTime createDate, LocalDateTime orderDate) {
        this.sessionId = sessionId;
        this.createDate = createDate;
        this.orderDate = orderDate;
    }
}
