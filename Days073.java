
package dayss073;

import java.util.Scanner;

public class Dayss073 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

        int angka;
        int total = 0;
        
        System.out.println("Masukkan angka (masukkan angka negatif untuk berhenti):");

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = in.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }
        
        System.out.println("Total penjumlahan = " + total);
    }
    
}
