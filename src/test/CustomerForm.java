package test;

public class CustomerForm {

    private final int age;
    private final String name;
    private final String gender;


    public CustomerForm(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public String getGender() {
        return this.gender;
    }
}
