package com.java.project.praktikum6;

public class tanpavariable {
    public static void main(String[] args) {
        
    }
    static void SayCongrats(String name, int[] values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if(finalValue >=75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else{
            System.out.println("maaf " + name + ",anda tidak lulus");
        }
    }
}
