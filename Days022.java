
package dayss022;

import java.util.Scanner;

public class Dayss022 {
    public static void main(String[] args) {
        Scanner ti = new Scanner (System.in);
        int sisi, luas;
        
        //Rumus : sisi*sisi = luas
        
        System.out.print("Masukkan sisi = ");
        sisi = ti.nextInt();
        
        luas = sisi*sisi;
        System.out.println("Luas Persegi = "+ luas);
        
    }
    
}
