package incerpay.paygate.presentation.dto.in;

import java.util.UUID;

public record PaymentRejectCommand(
    UUID paymentId,
    UUID transactionId
) {}

