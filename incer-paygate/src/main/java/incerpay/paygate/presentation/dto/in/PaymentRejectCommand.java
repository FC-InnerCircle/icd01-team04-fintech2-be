package incerpay.paygate.presentation.dto.in;

import incerpay.paygate.domain.enumeration.PaymentType;

import java.util.UUID;

public record PaymentRejectCommand(
    UUID paymentId,
    UUID transactionId,
    PaymentType type
) {}

