
package dayss045;

import java.util.Scanner;

public class Dayss045 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan angka (1/2) : ");
        int angka = in.nextInt();
        
        switch (angka){
            case 1 :
                System.out.println("angka satu");
                break;
            case 2 :
                System.out.println("angka ini dua");
                break;
            default:
                System.out.println("angka salah");
        }
    }
    
}
