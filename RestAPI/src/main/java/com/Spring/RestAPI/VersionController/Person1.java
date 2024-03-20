package com.Spring.RestAPI.VersionController;

public class Person1 {

    private Name name1;

    public Person1(Name name1) {
        this.name1 = name1;
    }

    public Name getName1() {
        return name1;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name1=" + name1 +
                '}';
    }
}
