package main.java;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private int scannerAge;
    private String scannerName;
    private String scannerGender;

    public ArrayList<CustomerForm> customerList() {
        var no0 = new CustomerForm(scannerAge, scannerName, scannerGender);
        return new ArrayList<>(List.of(no0));
    }

    public void setScannerAge(final int scannerAge) {
        this.scannerAge = scannerAge;
    }

    public void setScannerName(final String scannerName) {
        this.scannerName = scannerName;
    }

    public void setScannerGender(final String scannerGender) {
        this.scannerGender = scannerGender;
    }
}
