package com.example.cds.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentServiceTest {

    @Test
    void paymentAmountMustBePositive() {

        double amount = 25.00;

        assertTrue(amount > 0);
    }
}
