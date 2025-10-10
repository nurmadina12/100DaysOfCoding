
package dayss034;

import java.util.Scanner;

public class Dayss034 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka1 : ");
        byte e = input.nextByte();
        System.out.print("Masukkan angka2 : ");
        byte l = input.nextByte();
        
        if (e>=20 && l<=50){
            System.out.println("e lebih dari 20 dan l kurang dari 50 ");
        }else{
            System.out.println("kedua kondisi tidak terpenuhi ");
        }
        
    }
    
}
