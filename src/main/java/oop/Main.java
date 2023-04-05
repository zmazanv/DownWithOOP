package oop;

import oop.people.Entrepreneur;
import oop.people.employment.HourlyEmployee;
import oop.people.employment.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourler = new HourlyEmployee("Mike", 15, 40);
        hourler.printBadge();

        HourlyEmployee hourlerer = new HourlyEmployee("Michaelangelo", 16, 40, true);
        hourlerer.printBadge();


        SalariedEmployee salarier = new SalariedEmployee("Jane", 104_285.71);
        salarier.printBadge();

        SalariedEmployee salarierer = new SalariedEmployee("Janice", 140_392.98, true);
        salarierer.printBadge();


        Entrepreneur entrepreneurier = new Entrepreneur("Jim", 2000, 500);
        System.out.println(entrepreneurier.toString());

        Worker[] workers = { hourler, hourlerer, salarier, salarierer, entrepreneurier };
        Person.printPay(workers);

        Cloth jacket = new Cloth("Jacket", 224);
        Cloth suit = new Cloth("Suit", 500);
        Cloth.printClothDiscount(jacket, hourlerer);
        Cloth.printClothDiscount(jacket, salarier);
        Cloth.printClothDiscount(jacket, entrepreneurier);
        Cloth.printClothDiscount(suit, workers);

    }
}
