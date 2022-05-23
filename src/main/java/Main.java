package main.java;

public class Main {
    public static void main(String[] args) {

        int i;
        for (i = 0; i <= 7; i++) {
            Pricing.info(CustomerList.customerList().get(i));
        }
    }
}
