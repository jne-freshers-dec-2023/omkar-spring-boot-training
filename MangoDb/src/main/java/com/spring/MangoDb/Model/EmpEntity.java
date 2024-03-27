package com.spring.MangoDb.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection ="Employee")
public class EmpEntity {
     @Id
    private int id;
    private String name;
    private String address;

    private List<Product> list;  // one employee has many product order so i have taken list

    private Address Paddress; // emp has only one p add.

    public EmpEntity(int id, String name, String address, List<Product> list, Address paddress) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.list = list;
        Paddress = paddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Address getPaddress() {
        return Paddress;
    }

    public void setPaddress(Address paddress) {
        Paddress = paddress;
    }
}
