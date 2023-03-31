package oop;

import oop.work.Entrepreneur;
import oop.work.HourlyEmployee;
import oop.work.SalariedEmployee;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public static void printPay(Person person) {
        if (person instanceof HourlyEmployee) {
            System.out.println("Hourly Employee's Pay: " + ((HourlyEmployee) person).getPay());
        }
        else if (person instanceof SalariedEmployee) {
            System.out.println("Salaried Employee's Pay: " + ((SalariedEmployee) person).getPay());
        } else if (person instanceof Entrepreneur) {
            System.out.println("Entrepreneur's Pay: " + ((Entrepreneur) person).getProfit());
        }
    }
}