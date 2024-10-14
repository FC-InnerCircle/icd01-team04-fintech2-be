package incerpay.paygate.presentation.dto.in;

public record CardApiApproveCommand(
        String customerName,
        int installmentPeriod,
        Long price,
        String cardIdentityCertifyNumber,
        String cardNumber,
        String cvc,
        String expireDate,
        String cardCompany
) {}