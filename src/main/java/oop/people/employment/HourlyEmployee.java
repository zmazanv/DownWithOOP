package oop.people.employment;

import oop.Cloth;

import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {

    // Instance variables
    private double hourlyRate;
    private double hoursWorked;

    // Constructors
    public HourlyEmployee(String name, Cloth[] clothingItems, double hourlyRate, double hoursWorked) {
        super(name, clothingItems);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, Cloth[] clothingItems, double hourlyRate, double hoursWorked, boolean isManager) {
        super(name, clothingItems, isManager);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public double getHourlyRate() {
        return this.hourlyRate;
    }
    public double getHoursWorked() {
        return this.hoursWorked;
    }

    // Setters
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Instance method
    @Override
    public void printBadge() {
        StringBuilder badge = new StringBuilder();
        if (this.getIsManager()) {
            badge.append("Hourly Manager: " + this.getName() + '\n');
        } else {
            badge.append("Hourly Employee: " + this.getName() + '\n');
        }
        badge.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(badge);
    }

    @Override
    public void printWeeklyPay() {
        StringBuilder pay = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.hourlyRate * this.hoursWorked));
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
            discount.append("Hourly Manager's Discount Amount: $" + formattedValue);
        } else {
            discount.append("Hourly Employee's Discount Amount: $" + formattedValue);
        }
        System.out.println(discount);
    }

    public void printItemDiscountAmount(String itemDescription, double itemPrice) {
        StringBuilder discount = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.getNetDiscount() * itemPrice));
        if (this.getIsManager()) {
            discount.append("Hourly Manager's Discount Amount for " + itemDescription + ": $" + formattedValue);
        } else {
            discount.append("Hourly Employee's Discount Amount for " + itemDescription + ": $" + formattedValue);
        }
        System.out.println(discount);
    }
}
