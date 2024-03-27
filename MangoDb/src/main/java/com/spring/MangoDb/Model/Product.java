package com.spring.MangoDb.Model;


public class Product {

    private String name;
    private int quntity;

    public Product(String name, int quntity) {
        this.name = name;
        this.quntity = quntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }
}
