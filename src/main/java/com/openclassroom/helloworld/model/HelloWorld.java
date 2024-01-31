package com.openclassroom.helloworld.model;

import org.springframework.boot.CommandLineRunner;



public class HelloWorld{

    private String value = "Hello World";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }


}
