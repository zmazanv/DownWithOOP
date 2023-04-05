package oop.people.employment;

import oop.Person;

public abstract class Employee extends Person implements Worker {

    // Instance variables
    private int identificationNumber;
    private static int counter = 0;

    // Constructor
    protected Employee(String name) {
        super(name);
        this.identificationNumber = ++counter;
    }

    // Getter
    protected int getIdentificationNumber() {
        return this.identificationNumber;
    }

    // Abstract instance method
    protected abstract void printBadge();

}