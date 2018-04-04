package io.gary.bestshop.messaging.event.payment;

import io.gary.bestshop.messaging.dto.PaymentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentReceivedEvent {

    private PaymentDto payment;
}
