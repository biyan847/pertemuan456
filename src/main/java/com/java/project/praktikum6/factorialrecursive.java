package com.java.project.praktikum6;

public class factorialrecursive {
    static int factorial(int value){
        if(value ==1){
         return 1;
        }else{
            return value * factorial(value -1);
        }
    }
}
