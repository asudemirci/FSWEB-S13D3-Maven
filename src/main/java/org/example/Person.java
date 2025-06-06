package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    String email;
    String gender;
    String nationality;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, String email, String gender, String nationality) {
        this(firstName, lastName, age);
        this.email = email;
        this.gender = gender;
        this.nationality = nationality;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
