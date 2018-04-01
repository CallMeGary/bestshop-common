package io.gary.bestshop.messaging.event.product;

import io.gary.bestshop.messaging.dto.ProductDto;
import io.gary.bestshop.messaging.dto.ReviewDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductReviewAddedEvent {

    private ProductDto product;

    private ReviewDto newReview;
}
