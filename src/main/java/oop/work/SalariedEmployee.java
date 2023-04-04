package oop.work;

public class SalariedEmployee extends Employee implements IWork {
    final private byte weeksInYear = 365 / 7;
    private double salary;
    private double pay;
    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.pay = this.salary / weeksInYear;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPay() {
        return this.pay;
    }

    @Override
    public String formatPay() {
        StringBuilder formattedPay = new StringBuilder("Salaried Employee's Pay: ");
        formattedPay.append(this.pay);
        return formattedPay.toString();
    }

    @Override
    public void printBadge() {
        StringBuilder output = new StringBuilder();
        output.append("Salaried Employee: " + this.getName() + '\n');
        output.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(output);
    }
}
