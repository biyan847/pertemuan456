package com.java.project.praktikum6;

public class errorstackoverflow {
    static void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("loop" + value);
            loop(value-1);
        }
    }
}
