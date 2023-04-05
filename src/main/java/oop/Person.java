package oop;

public abstract class Person {

    // Instance variable
    private String name;

    // Constructor
    protected Person(String name) {
        this.name = name;
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
