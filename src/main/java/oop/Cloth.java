package oop;

import oop.people.employment.Employee;
import oop.people.employment.HourlyEmployee;

public class Cloth {

    // Instance variables
    private String description;
    private double price;

    // Constructor
    public Cloth(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Getters
    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

   // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Static method
    public static void printClothDiscount(Cloth cloth, Worker worker) {
        worker.printItemDiscountAmount(cloth.getPrice());
    }

    public static void printClothDiscount(Cloth cloth, Worker[] workers) {
        for (Worker worker : workers) {
            worker.printItemDiscountAmount(cloth.getPrice());
        }
    }

}