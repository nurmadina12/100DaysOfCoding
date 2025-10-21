
package dayss044;

import java.util.Scanner;

public class Dayss044 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();
        
        String Predikat;
        if (nilai>85){
            Predikat = "A";
        }else if (nilai>=75 && nilai<=85){
            Predikat = "B";
        }else if (nilai>=60 && nilai<=75){
            Predikat = "C";
        }else if (nilai>=50 && nilai<=60){
            Predikat = "D";
        }else{
            Predikat = "E";
        }
        System.out.println("Nilai \t \t: "+ nilai);
        System.out.println("Predikat \t: "+ Predikat);
        
    }
    
}
