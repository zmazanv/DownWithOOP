package oop;

import oop.people.Entrepreneur;
import oop.people.employment.HourlyEmployee;
import oop.people.employment.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        Cloth underwear = new Cloth("Underwear", 15);
        Cloth undershirt = new Cloth("Undershirt", 10);
        Cloth shirt = new Cloth("Dress Shirt", 40);
        Cloth pants = new Cloth("Dress Pants", 60);
        Cloth suit = new Cloth("Suit", 120);
        Cloth socks = new Cloth("Socks", 10);
        Cloth[] hourlyEmployeeUniform = { underwear, undershirt, shirt, pants, socks };
        Cloth[] salariedEmployeeUniform = { underwear, undershirt, shirt, pants, socks };
        Cloth[] entrepreneurClothing = salariedEmployeeUniform;

        HourlyEmployee hourler = new HourlyEmployee("Mike", hourlyEmployeeUniform, 15, 40);
        hourler.printBadge();

        HourlyEmployee hourlerer = new HourlyEmployee("Michaelangelo", hourlyEmployeeUniform, 16, 40, true);
        hourlerer.printBadge();

        System.out.println();
        System.out.println("---");
        System.out.println();

        SalariedEmployee salarier = new SalariedEmployee("Jane", salariedEmployeeUniform,104_285.71);
        salarier.printBadge();

        SalariedEmployee salarierer = new SalariedEmployee("Janice", salariedEmployeeUniform, 140_392.98, true);
        salarierer.printBadge();

        System.out.println();
        System.out.println("---");
        System.out.println();

        Entrepreneur entrepreneurier = new Entrepreneur("Jim", entrepreneurClothing, 2000, 500);
        System.out.println(entrepreneurier.toString());

        System.out.println();
        System.out.println("---");
        System.out.println();

        Worker[] workers = { hourler, hourlerer, salarier, salarierer, entrepreneurier };
        Person.printPay(workers);

        Cloth.printClothDiscount(shirt, hourler);
        Cloth.printClothDiscount(shirt, hourlerer);
        Cloth.printClothDiscount(pants, salarier);
        Cloth.printClothDiscount(pants, salarierer);
        Cloth.printClothDiscount(suit, entrepreneurier);
        Cloth.printClothDiscount(hourlyEmployeeUniform, hourler);
        Cloth.printClothDiscount(hourlyEmployeeUniform, hourlerer);
        Cloth.printClothDiscount(salariedEmployeeUniform, salarier);
        Cloth.printClothDiscount(salariedEmployeeUniform, salarierer);
        Cloth.printClothDiscount(entrepreneurClothing, entrepreneurier);
        Cloth.printClothDiscount(hourlyEmployeeUniform, workers);

    }
}
