package main.java;


import java.util.ArrayList;
import java.util.Arrays;

public class CustomerList {
    static ArrayList<CustomerForm> customerList() {
        var no1 = new CustomerForm(12, "田中", "男");
        var no2 = new CustomerForm(13, "山本", "男");
        var no3 = new CustomerForm(12, "鈴木", "女");
        var no4 = new CustomerForm(13, "佐藤", "女");

        var no5 = new CustomerForm(-1, "井上", "女");
        var no6 = new CustomerForm(199, "岡田", "女");

        var no7 = new CustomerForm(12, "山﨑", "あ");
        var no8 = new CustomerForm(13, "吉本", "あ");

        return new ArrayList<>(Arrays.asList(no1, no2, no3, no4, no5, no6, no7, no8));
    }
}
