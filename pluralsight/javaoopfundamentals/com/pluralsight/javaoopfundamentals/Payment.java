package com.pluralsight.javaoopfundamentals;

import java.util.UUID;

public class Payment {

    private final PaymentMethod paymentMethod;
    private final UUID transactionId;
    private int value;

    public Payment(PaymentMethod paymentMethod, int value, UUID transactionId) {
        this.paymentMethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + paymentMethod +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }
}
