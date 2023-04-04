package oop.work;

import oop.Person;

public class Entrepreneur extends Person implements IWork {
    private double revenue;
    private double expenses;
    private double profit;
    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
        this.profit = this.revenue - this.expenses;
    }

    public double getProfit() {
        return this.profit;
    }

    @Override
    public String formatPay() {
        StringBuilder formattedPay = new StringBuilder("Entrepreneur's Pay: ");
        formattedPay.append(this.profit);
        return formattedPay.toString();
    }

    @Override
    public String toString() {
       return "Entrepreneur{name is " + this.getName() + ", revenue is " + this.revenue + ", expenses are " + this.revenue + '}';
    }
}
