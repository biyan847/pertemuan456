package com.java.project.praktikum6;

public class overloading {
    static void sayhello(){
        System.out.println("hello");
    }
    static void sayhello(String fristname){
        System.out.println("hello" + fristname);
    }
    static void sayhello(String fristname, String lastname){
        System.out.println("hello" + fristname + "" + lastname);
    }
}
