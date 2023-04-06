package oop;

public interface Worker {
    
    // Abstract instance method
    void printWeeklyPay();
    void printItemDiscountAmount(double itemPrice);
    void printItemDiscountAmount(String itemDescription, double itemPrice);
}
