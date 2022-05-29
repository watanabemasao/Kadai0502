package main.java;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private static int scannerAge;
    private static String scannerName;
    private static String scannerGender;

    static ArrayList<CustomerForm> customerList() {
        var no0 = new CustomerForm(scannerAge, scannerName, scannerGender);
        return new ArrayList<>(List.of(no0));
    }

    public static void setScannerAge(final int scannerAge) {
        CustomerList.scannerAge = scannerAge;
    }

    public static void setScannerName(final String scannerName) {
        CustomerList.scannerName = scannerName;
    }

    public static void setScannerGender(final String scannerGender) {
        CustomerList.scannerGender = scannerGender;
    }
}
