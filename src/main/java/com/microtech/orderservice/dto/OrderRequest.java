package com.microtech.orderservice.dto;

import com.microtech.orderservice.model.OrderLineItems;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoList;
    private String orderNumber;

}
