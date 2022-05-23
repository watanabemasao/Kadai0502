package main.java;

public final class CustomerForm {

    private final int age;
    private final String name;
    private final String gender;


    public CustomerForm(final int age, final String name, final String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }
    String getGender() {
        return gender;
    }
}
