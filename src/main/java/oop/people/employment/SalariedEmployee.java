package oop.people.employment;

import oop.Cloth;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {

    // Static variable
    final static private double weeksInYear = (365 / 7);

    // Instance variable
    private double salary;

    // Constructors
    public SalariedEmployee(String name, Cloth[] clothingItems, double salary) {
        super(name, clothingItems);
        this.salary = salary;
    }

    public SalariedEmployee(String name, Cloth[] clothingItems, double salary, boolean isManager) {
        super(name, clothingItems, isManager);
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return this.salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Instance method
    @Override
    public void printBadge() {
        StringBuilder badge = new StringBuilder();
        if (this.getIsManager()) {
            badge.append("Salaried Manager: " + this.getName() + '\n');
        } else {
            badge.append("Salaried Employee: " + this.getName() + '\n');
        }
        badge.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(badge);
    }

    @Override
    public void printWeeklyPay() {
        StringBuilder pay = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.salary / weeksInYear));
        if (this.getIsManager()) {
            pay.append("Hourly Manager's Pay: $" + formattedValue);
        } else {
            pay.append("Hourly Employee's Pay: $" + formattedValue);
        }
        System.out.println(pay);
    }

    @Override
    public void printItemDiscountAmount(double itemPrice) {
        StringBuilder discount = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.getNetDiscount() * itemPrice));
        if (this.getIsManager()) {
            discount.append("Salaried Manager's Discount Amount: $" + formattedValue);
        } else {
            discount.append("Salaried Employee's Discount Amount: $" + formattedValue);
        }
        System.out.println(discount);
    }

    public void printItemDiscountAmount(String itemDescription, double itemPrice) {
        StringBuilder discount = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.getNetDiscount() * itemPrice));
        if (this.getIsManager()) {
            discount.append("Salaried Manager's Discount Amount for " + itemDescription + ": $" + formattedValue);
        } else {
            discount.append("Salaried Employee's Discount Amount for " + itemDescription + ": $" + formattedValue);
        }
        System.out.println(discount);
    }
}
