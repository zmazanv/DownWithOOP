package oop;

import oop.work.Entrepreneur;
import oop.work.HourlyEmployee;
import oop.work.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourler = new HourlyEmployee("Jim", 15, 40);
        hourler.printBadge();
        hourler.printPay();

        SalariedEmployee salarier = new SalariedEmployee("Mike", 104_285.71);
        salarier.printBadge();
        salarier.printPay();

        Entrepreneur entreprenerier = new Entrepreneur("Rob", 2000, 500);
        System.out.println(entreprenerier);

        Person.printPay(hourler);
        Person.printPay(salarier);
        Person.printPay(entreprenerier);
    }
}
