package com.java.project.praktikum4;



public class ifsatetment 
{
   //if &&else statement
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 90;
        String Nilai = "A";
       
    
        if
        (
            nilai >= 75 && absen >= 75){
            System.out.println("lulus");
        }
        else{
       System.out.println("GAGAL");
        }

//else if
        if (nilai >= 80 && absen >=80){
            System.out.println("nilai anda A");
        }
        else if (nilai >= 70 && absen >= 70){
            System.out.println("nilai anda B");
        }
         else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda C");
        }
         else if (nilai >= 50 && absen >= 50){
            System.out.println("nilai anda D");
        }
         else{
            System.out.println("nilai anda E");
        }

//switch statement
        switch (Nilai) {
            case "A":
                System.out.println("wow anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("anda lulus");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
            System.out.println("mungkin anda salah jurusan");
                
        }


       

    }
}
