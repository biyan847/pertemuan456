package com.java.project.praktikum6;

public class factorialloop {
    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value; i++){
            result *=i;
        }
        return result;
    }
}
