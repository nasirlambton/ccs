package com.ccs.consultingapplication;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "com.ccs.consultingapplication.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
