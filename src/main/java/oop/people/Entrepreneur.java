package oop.people;

import oop.Person;
import oop.people.employment.Worker;

import java.text.DecimalFormat;

public class Entrepreneur extends Person implements Worker {

    // Instance variables
    private double expenses;
    private double revenue;

    // Constructor
    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
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

}
