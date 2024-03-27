package com.spring.MangoDb.Model;

public class Address {

    String permenentCity;
     String Pin;

    public Address(String permenentCity, String pin) {
        this.permenentCity = permenentCity;
        Pin = pin;
    }

    public String getPermenentCity() {
        return permenentCity;
    }

    public void setPermenentCity(String permenentCity) {
        this.permenentCity = permenentCity;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }
}
