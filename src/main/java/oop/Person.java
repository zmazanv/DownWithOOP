package oop;

public abstract class Person {

    // Instance variable
    private String name;
    private Cloth[] clothingItems;

    // Constructor
    protected Person(String name, Cloth[] clothingItems) {
        this.name = name;
        this.clothingItems = clothingItems;
    }

    // Getter
    protected String getName() {
        return this.name;
    }

    // Setter
    protected void setName(String name) {
        this.name = name;
    }

    // Static method
    public static void printPay(Worker[] persons) {
        for (Worker person : persons) {
            person.printWeeklyPay();
        }
    }

}
