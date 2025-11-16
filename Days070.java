package dayss070;

import java.util.Scanner;

public class Dayss070 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        System.out.println("Pola Persegi Panjang:");

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
