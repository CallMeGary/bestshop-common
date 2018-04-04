package io.gary.bestshop.messaging.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Wither
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private String id;

    private String orderId;

    private String instrument;

    private BigDecimal amount;

    private String status;

    private LocalDateTime createdAt;

}
