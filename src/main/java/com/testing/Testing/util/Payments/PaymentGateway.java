package com.testing.Testing.util.Payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
