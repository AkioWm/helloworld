package com.openclassroom.helloworld.model;

import org.springframework.boot.CommandLineRunner;



public class HelloWorld{

    public String value;
    public HelloWorld(){
        value = "Hello World";
    }
    public String toString(){
        return value;
    }


}
