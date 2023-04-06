package oop.people;

import oop.Cloth;
import oop.Person;
import oop.Worker;

import java.text.DecimalFormat;

public class Entrepreneur extends Person implements Worker {

    // Instance variables
    private double expenses;
    private double revenue;
    final private double netDiscount = 0.02;

    // Constructor
    public Entrepreneur(String name, Cloth[] clothingItems, double revenue, double expenses) {
        super(name, clothingItems);
        this.expenses = expenses;
        this.revenue = revenue;
    }

    // Getters
    public double getExpenses() {
        return this.expenses;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public double getNetDiscount() {
        return this.netDiscount;
    }

    // Setters
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    // Instance methods
    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        representation.append("Entrepreneur:{[Name]: "+ this.getName() + ", [Revenue]: " + this.revenue + ", [Expenses]: " + this.expenses + "}");
        return representation.toString();
    }

    @Override
    public void printWeeklyPay() {
        StringBuilder pay = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.revenue - this.expenses));
        pay.append("Entrepreneur's Pay: $" + formattedValue);
        System.out.println(pay);
    }

    @Override
    public void printItemDiscountAmount(double itemPrice) {
        StringBuilder discount = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.getNetDiscount() * itemPrice));
        discount.append("Entrepreneur's Discount Amount: $" + formattedValue);
        System.out.println(discount);
    }

    public void printItemDiscountAmount(String itemDescription, double itemPrice) {
        StringBuilder discount = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.getNetDiscount() * itemPrice));
        discount.append("Entrepreneur's Discount Amount for " + itemDescription + ": $" + formattedValue);
        System.out.println(discount);
    }

}
