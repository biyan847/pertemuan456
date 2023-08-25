package com.java.project.praktikum4;
//lambada
public class switchstate {
    public static void main(String[] args) {
    var nilai = "A";
    String ucapan;
    var Nilai = 75;
    
    
    

    switch (nilai) {
        case "A" -> System.out.println("wow anda lulus");
        case "B", "C" -> System.out.println("ANDA LULUS");
        case "d" -> System.out.println("anda tidak lulus");
        default -> {
            System.out.println("mungkin anda salah jurusan");
        }
            
   }
   //switch tanpa yield
   switch (nilai) {
        case "A" -> ucapan = " wow anda lulus";
        case "B", "C" -> ucapan = "anda lulus";
        case "d" -> ucapan = "anda tidak lulus";
        default -> ucapan = "salah jurusan"; 

   }
   System.out.println(ucapan);
   
   // switch dengan yield
   String Ucapan = switch (nilai) {
    case "A":
        yield "wow anda lulus";
    case "B", "C":
        yield "anda lulus";
    case "D":
        yield "anda tidak lulus";
    default:
        yield "munkin anda salah jurusan";
   };
   System.out.println(Ucapan);


   //tanpa ternary Operator
   if (Nilai >= 75){
    ucapan = "selamat anda lulus";
   } else {
    ucapan = "silahkan coba lagi";
   }


   //dengan ternary operator
   String UCAPAN = Nilai >= 75 ? "selamat anda lulus" : "selhkan coba lagi";
   System.out.println(UCAPAN);
 }
}
