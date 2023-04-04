package oop.work;

public class HourlyEmployee extends Employee implements IWork {
    private double hourlyRate;
    private double hoursWorked;
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double getPay() {
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public String formatPay() {
        StringBuilder formattedPay = new StringBuilder("Hourly Employee's Pay: ");
        formattedPay.append(this.hourlyRate * this.hoursWorked);
        return formattedPay.toString();
    }

    public void getHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printBadge() {
        StringBuilder output = new StringBuilder();
        output.append("Hourly Employee: " + this.getName() + '\n');
        output.append("Employee ID: " + this.getIdentificationNumber());
        System.out.println(output);
    }
}
