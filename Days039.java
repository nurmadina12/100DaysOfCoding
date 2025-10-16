
package dayss039;

import java.util.Scanner;

public class Dayss039 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.println("---Daftar Menu---");
        System.out.println("1.Nasi campur");
        System.out.println("2.Bakso");
        System.out.println("3.Nasi Goreng");
        
        System.out.print("Masukkan pilihan anda(1,2,3): ");
        int p = in.nextInt();
        
        if (p == 1){
            System.out.println("Anda Memilih Nasi Cmpur");
        }else if(p == 2){
            System.out.println("Anda Memilih Bakso");
        }else if (p == 3){
            System.out.println("Anda Memilih Nasi Goreng");
        }else{
            System.out.println("Pilihan Tidak Valid");
        }
    }
    
}
