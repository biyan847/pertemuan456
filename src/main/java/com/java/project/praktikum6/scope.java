package com.java.project.praktikum6;

public class scope {
 static void sayhello(String name){
    String hello = "hello" + name;
    if (!name.isBlank()){
        String hi = "hi" +name;
        System.out.println(hi);
    }

    System.out.println(hello);
 }   

 /**
 * menghitung jumlah a+b
 * 
 * @param a nilai a
 * @param b nilai b
 * @return a + b
 */
static int sum (int a, int b){
    //jumlahkan a+b
    return a + b;
}
}
