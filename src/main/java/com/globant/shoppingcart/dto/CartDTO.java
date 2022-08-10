package com.globant.shoppingcart.dto;

import com.globant.shoppingcart.model.OrderDetail;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class CartDTO {

    private String sessionId;
    private LocalDateTime orderDate;
    private List<OrderDetailDTO> orderDetailList;
    private Status status;

    public CartDTO(String sessionId, LocalDateTime orderDate, List<OrderDetailDTO> orderDetailList, Status status) {
        this.sessionId = sessionId;
        this.orderDate = orderDate;
        this.orderDetailList = orderDetailList;
        this.status = status;
    }
}
