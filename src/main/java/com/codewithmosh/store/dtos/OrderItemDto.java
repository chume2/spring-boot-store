package com.codewithmosh.store.dtos;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderItemDto {
    private OrderProductDto product;
    private Integer quantity;
    private BigDecimal totalPrice;
}
