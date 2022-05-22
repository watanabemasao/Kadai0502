package java;

public class Main {
    public static void main(String[] args) {

        CustomerList list = new CustomerList();

        int i = 0;
        for (i = 0; i <= 7 ; i++) {
            Pricing.info(list.customerList().get(i));
        }
    }
}
