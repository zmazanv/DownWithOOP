package oop.people.employment;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {

    // Static variable
    final static private double weeksInYear = (365 / 7);

    // Instance variable
    private double salary;

    // Constructor
    public SalariedEmployee(String name, double salary) {
        super(name);
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
        badge.append("Salaried Employee: " + this.getName() + '\n');
        badge.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(badge);
    }

    @Override
    public void printWeeklyPay() {
        StringBuilder pay = new StringBuilder();
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        double formattedValue = Double.parseDouble(twoNumbers.format(this.salary / weeksInYear));
        pay.append("Salaried Employee's Pay: $" + formattedValue);
        System.out.println(pay);
    }
}
