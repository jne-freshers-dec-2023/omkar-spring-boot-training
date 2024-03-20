package com.Spring.RestAPI.Controller;

public class HellowordBean {

    private String helloworld;

    public HellowordBean(String helloWorld) {
        this.helloworld=helloWorld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }

    @Override
    public String toString() {
        return "HellowordBean{" +
                "helloworld='" + helloworld + '\'' +
                '}';
    }

    public String getHelloworld() {
        return helloworld;
    }

}
