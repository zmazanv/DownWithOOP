package oop.work;

import oop.Person;

public class Entrepreneur extends Person implements IWork {
    private double revenue;
    private double expenses;
    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public double getProfit() {
        return (this.revenue - this.expenses);
    }

    @Override
    public String formatPay() {
        StringBuilder formattedPay = new StringBuilder("Entrepreneur's Pay: ");
        formattedPay.append(this.revenue - this.expenses);
        return formattedPay.toString();
    }

    @Override
    public String toString() {
       return "Entrepreneur{name is " + this.getName() + ", revenue is " + this.revenue + ", expenses are " + this.revenue + '}';
    }
}
