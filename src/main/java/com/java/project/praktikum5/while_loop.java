package com.java.project.praktikum5;

public class while_loop {
    public static void main(String[] args) {
        var counter = 1;
        var Counter = 100;
        while (counter <= 10){
            System.out.println("perulangan ke" + counter);
            counter++;
        }
        //do while
        do{
            System.out.println("perulangan ke-" + Counter);
            Counter++;
        } while (Counter <= 10);
        
        //break
        while (true){
            System.out.println("perulangan ke" + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }
        //countinue
        for(int COUNTER = 1; COUNTER <= 100; COUNTER++ ){
            if(COUNTER % 2 == 0){
                continue;
            }
            System.out.println("perulanyan ganjil"+ COUNTER);
        }
        //tanpa for each
        String[] array ={
            "eko","kurniawan","khenendy",
            "prgrammer","zaman","now"
        };
        for (int i = 0; i <array.length; i++){
            System.out.println(array[i]);
        }
        //for each
        String[] Array = {
             "eko","kurniawan","khenendy",
            "prgrammer","zaman","now"
        };
        for ( var value : Array){
            System.out.println(value);
        }
    }
}
