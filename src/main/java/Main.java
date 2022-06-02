package main.java;

import java.util.Scanner;
public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuProduct menuProduct = new MenuProduct();
        CinemaPricing cinemaPricing = new  CinemaPricing();
        System.out.println("年齢を入力してください");
        int scannerAge = Integer.parseInt(scanner.next());
        System.out.println("名前を入力してください");
        String scannerName = String.format(scanner.next());
        System.out.println("性別を入力してください");
        String scannerGender = String.format(scanner.next());
        CustomerList customerList = new CustomerList(scannerAge, scannerName, scannerGender);
        System.out.println("=====================================");
        System.out.println(cinemaPricing.cinemaInfo(customerList.customerList().get(0)));
        System.out.println("=====================================");
        System.out.println("ドリンクをお選びください");
        System.out.println("--------------------------------------");
        menuProduct.drinkPriceOut();
        String scannerDrink = String.format(scanner.next());
        System.out.println("フードをお選びください");
        System.out.println("--------------------------------------");
        menuProduct.foodPriceOut();
        String scannerFood = String.format(scanner.next());
        System.out.println("--------------------------------------");

        menuProduct.productPriceOut(scannerDrink, scannerFood);
    }
}
