package test;

public class CustomerForm {

    private final int AGE;
    private final String NAME;
    private final String GENDER;


    public CustomerForm(int age, String name, String gender) {
        this.AGE = age;
        this.NAME = name;
        this.GENDER = gender;
    }
    public int getAge() {
        return this.AGE;
    }
    public String getName() {
        return this.NAME;
    }
    public String getGender() {
        return this.GENDER;
    }
}
