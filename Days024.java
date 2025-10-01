
package dayss24;

import java.util.Scanner;

public class Dayss24 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double jari_jari, luas; 
         
        System.out.print("Masukkan jari-jari lingkaran= ");
        jari_jari = input.nextDouble();

        // Hitung luas lingkaran
        luas = Math.PI * jari_jari * jari_jari;

        System.out.println("Luas lingkaran adalah= " + luas);
    }
}

