
package days036;

import java.util.Scanner;

public class Days036 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan usia minimal hingga maiximal daftar kerja : ");
        byte usia = in.nextByte();
        if (usia>=19){
            if (usia>=34){
                System.out.println("Bisa daftar kerja");
            }else{
            System.out.println("bisa daftar");
        }
        }else{
            System.out.println("Tidak bisa daftar");
        }
        
    }
    
}
