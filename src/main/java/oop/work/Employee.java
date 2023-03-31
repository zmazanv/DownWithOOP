package oop.work;

import oop.Person;

public abstract class Employee extends Person {
    private int identificationNumber;

    private static int counter = 0;

    public Employee(String name) {
        super(name);
        this.identificationNumber = ++counter;
    }

    public int getIdentificationNumber() {
        return this.identificationNumber;
    }

    public abstract void printBadge();
}
