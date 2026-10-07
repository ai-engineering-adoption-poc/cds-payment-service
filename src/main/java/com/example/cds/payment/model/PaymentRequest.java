package com.example.cds.payment.model;

public class PaymentRequest {

    private String customerId;
    private String orderId;
    private String cardToken;
    private double amount;
    private String currency;

    public String getCustomerId() {
        return customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCardToken() {
        return cardToken;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
