package com.sherlock.restfulwebservices.Entity;

public class HelloWorldBean {
    private String helloMsg;

    public HelloWorldBean(String helloMsg) {
        this.helloMsg = helloMsg;
    }

    public String getHelloMsg() {
        return helloMsg;
    }

    public void setHelloMsg(String helloMsg) {
        this.helloMsg = helloMsg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "helloMsg='" + helloMsg + '\'' +
                '}';
    }
}
