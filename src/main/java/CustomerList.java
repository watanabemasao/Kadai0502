package main.java;

import java.util.Collections;
import java.util.List;

public class CustomerList {
    private int scannerAge;
    private String scannerName;
    private String scannerGender;

    public CustomerList(final int scannerAge,
                        final String scannerName, final String scannerGender) {
        this.scannerAge = scannerAge;
        this.scannerName = scannerName;
        this.scannerGender = scannerGender;
    }

    public List<CustomerForm> customerList() {
        return Collections.singletonList(new CustomerForm(scannerAge, scannerName, scannerGender));
    }
}
