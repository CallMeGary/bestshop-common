package io.gary.bestshop.messaging.event.product;

import io.gary.bestshop.messaging.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreatedEvent {

    private ProductDto newProduct;
}
