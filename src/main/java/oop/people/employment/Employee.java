package oop.people.employment;

import oop.Cloth;
import oop.Person;
import oop.Worker;

public abstract class Employee extends Person implements Worker {

    // Static variable
    private static int counter = 0;
    final private static double flatEmployeeDiscount = 0.1;
    final private static double managerialDiscountBonus = 0.05;

    // Instance variables
    final private int identificationNumber;
    private boolean isManager;
    private double netDiscount;

    // Constructors
    protected Employee(String name, Cloth[] clothingItems) {
        super(name, clothingItems);
        this.identificationNumber = ++counter;
        this.isManager = false;
        this.netDiscount = flatEmployeeDiscount;
    }

    protected Employee(String name, Cloth[] clothingItems, boolean isManager) {
        super(name, clothingItems);
        this.identificationNumber = ++counter;
        this.isManager = isManager;
        if (this.isManager) {
            this.netDiscount = flatEmployeeDiscount + managerialDiscountBonus;
        } else {
            this.netDiscount = flatEmployeeDiscount;
        }
    }

    // Getters
    protected int getIdentificationNumber() {
        return this.identificationNumber;
    }

    protected boolean getIsManager() {
        return this.isManager;
    }

    protected double getNetDiscount() {
        return this.netDiscount;
    }

    // Setter
    protected void setIsManager(boolean isManager) {
        this.isManager = isManager;
        if (this.isManager) {
            this.netDiscount = flatEmployeeDiscount + managerialDiscountBonus;
        } else {
            this.netDiscount = flatEmployeeDiscount;
        }
    }

    // Abstract instance method
    protected abstract void printBadge();

}