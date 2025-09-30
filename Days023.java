
package dayss023;

import java.util.Scanner;

public class Dayss023 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       double Panjang, luas, lebar;
       
        System.out.print("Masukkan Panjang pp = ");
        Panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar pp = ");
        lebar = input.nextDouble();
        
        // Luas = Panjang*Lebar
        
        luas = Panjang*lebar;
        System.out.println("Luas Persegi Panjang Adalah "+ luas);
        
    }
    
}
