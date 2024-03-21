package com.Spring.RestAPI.VersionController;

public class Name {

    private String Fisrtname;
    private String lastname;

    public Name(String fisrtname, String lastname) {
        Fisrtname = fisrtname;
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return Fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "Fisrtname='" + Fisrtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
