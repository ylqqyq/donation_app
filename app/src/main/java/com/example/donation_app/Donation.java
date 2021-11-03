package com.example.donation_app;

public class Donation {

    double donationAmount;
    int paymentMethod;//1 paypal 2 credit card

    public Donation(double donationAmount, int paymentMethod) {
        this.donationAmount = donationAmount;
        this.paymentMethod = paymentMethod;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
