package incerpay.paygate.presentation.dto.out;

import incerpay.paygate.domain.vo.PaymentState;
import org.javamoney.moneta.Money;

import java.util.UUID;

public record PersistenceView(
        UUID paymentId,
        UUID transactionId,
        String sellerId,
        PaymentState state,
        Long amount
) {
    public PersistenceView(UUID paymentId, UUID transactionId, String sellerId, PaymentState state, Money amount) {
        this(paymentId, transactionId, sellerId, state, amount.getNumber().longValue());
    }
}
