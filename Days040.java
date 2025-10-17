
package dayss040;

import java.util.Scanner;

public class Dayss040 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double ini1 = in.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = in.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double ini2 = in.nextDouble();

        double hasil;

        if (operator == '+') {
            hasil = ini1 + ini2;
            System.out.println(ini1 + " + " + ini2 + " = " + hasil);
        } else if (operator == '-') {
            hasil = ini1 - ini2;
            System.out.println(ini1 + " - " + ini2 + " = " + hasil);
        } else if (operator == '*') {
            hasil = ini1 * ini2;
            System.out.println(ini1 + " * " + ini2 + " = " + hasil);
        } else if (operator == '/') {
            if (ini2 != 0) {
                hasil = ini1 / ini2;
                System.out.println(ini1 + " / " + ini2 + " = " + hasil);
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol.");
            }
        } else {
            System.out.println("Operator yang Anda masukkan tidak valid.");
        
    
}
    }
    
}
