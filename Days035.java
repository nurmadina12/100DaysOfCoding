
package days035;

import java.util.Scanner;

public class Days035 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        byte nilai = input.nextByte();

        
        if (nilai <= 75){
            System.out.println("Anda tidak lulus ");
        }else{
            System.out.println("Selamat anda lulus! ");
        }
    }
    
}
