package oop.work;

public class SalariedEmployee extends Employee implements IWork {
    final private byte weeksInYear = 365 / 7;
    private double salary;
    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPay() {
        return (this.salary / weeksInYear);
    }

    @Override
    public String formatPay() {
        StringBuilder formattedPay = new StringBuilder("Salaried Employee's Pay: ");
        formattedPay.append(this.salary / weeksInYear);
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
