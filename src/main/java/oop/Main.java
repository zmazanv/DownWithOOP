package oop;

import oop.people.Entrepreneur;
import oop.people.employment.HourlyEmployee;
import oop.people.employment.SalariedEmployee;
import oop.people.employment.Worker;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourler = new HourlyEmployee("Mike", 15, 40);
        hourler.printBadge();

        SalariedEmployee salarier = new SalariedEmployee("Jane", 104_285.71);
        salarier.printBadge();

        Entrepreneur entrepreneurier = new Entrepreneur("Jim", 2000, 500);
        System.out.println(entrepreneurier.toString());

        Worker[] workers = { hourler, salarier, entrepreneurier };
        Person.printPay(workers);

    }
}
