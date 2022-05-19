package com.netcracker.HW3.ch3;

public class CashRegister {
    private double purchase;
    private double payment;
    private double change;
    private double tax;
    private int items;

    public CashRegister(double tax) {
        payment = 0;
        purchase = 0;
        items = 0;
        this.tax = tax;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        items++;
    }

    public void enterPayment(int amount) {
        payment += amount;
    }

    public void recordTaxablePurchase(double amount) {
        purchase += amount * tax / 100;
        items++;
    }

    public double giveChange() {
        change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public double getTotalTax() {
        return tax;
    }

    public double getItemCount() {
        return items;
    }
    public static void main(String[] args) {

    }
}
