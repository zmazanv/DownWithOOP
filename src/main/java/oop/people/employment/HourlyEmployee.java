package oop.people.employment;

import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {

    // Instance variables
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
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
        badge.append("Hourly Employee: " + this.getName()+ '\n');
        badge.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(badge);
    }

    @Override
    public void printWeeklyPay() {
        StringBuilder pay = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.hourlyRate * this.hoursWorked));
        pay.append("Hourly Employee's Pay: $" + formattedValue);
        System.out.println(pay);
    }
}
