package io.gary.bestshop.messaging.event.order;

import io.gary.bestshop.messaging.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDeliveredEvent {

    private OrderDto order;
}
