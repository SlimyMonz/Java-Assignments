/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package learning.learn_intellij.person;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First Name: '" + firstName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Age: " + age +
                '}';
    }

}
