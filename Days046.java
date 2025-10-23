
package dayss046;

import java.util.Scanner;

public class Dayss046 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.println("===Daftar Menu===");
        System.out.println("1.Bakso \n2.Sate ayam \n3.Ayam lalapan");
        System.out.print("Pilihan Menu : ");
        int pil = in.nextInt();
        
        switch (pil){
            case 1:
                System.out.println("Anda Memilih Bakso");
                break;
            case 2:
                System.out.println("Anda Memilih Sate ayam");
                break;
            case 3:
                System.out.println("Anda Memilih Ayam lalapan");
                break;
            default:
                System.out.println("Pilihan tidak valid masukkan pilihan 1-3");
        }
    }
    
}
