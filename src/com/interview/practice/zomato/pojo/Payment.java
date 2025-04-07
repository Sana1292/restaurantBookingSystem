package com.interview.practice.zomato.pojo;

import java.util.UUID;

public class Payment {
    private final UUID paymentId;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public Payment(PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID();
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentMode=" + paymentMode +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
