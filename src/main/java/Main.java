package main.java;

import java.util.Scanner;
public class Main {
    public static void main(final String[] args) {
        MenuProduct menuProduct = new MenuProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください");
        int scannerAge = Integer.parseInt(scanner.next());
        System.out.println("名前を入力してください");
        String scannerName = String.format(scanner.next());
        System.out.println("性別を入力してください");
        String scannerGender = String.format(scanner.next());
        CustomerList.setScannerAge(scannerAge);
        CustomerList.setScannerName(scannerName);
        CustomerList.setScannerGender(scannerGender);
        System.out.println("=====================================");
        System.out.println(CinemaPricing.cinemaInfo(CustomerList.
                customerList().get(0)));
        System.out.println("=====================================");
        System.out.println("ドリンクをお選びください");
        System.out.println("--------------------------------------");
        MenuProduct.drinkPriceOut();
        String scannerDrink = String.format(scanner.next());
        System.out.println("フードをお選びください");
        System.out.println("--------------------------------------");
        MenuProduct.foodPriceOut();
        String scannerFood = String.format(scanner.next());
        System.out.println("--------------------------------------");

        MenuProduct.productPriceOut(scannerDrink, scannerFood);





    }

}