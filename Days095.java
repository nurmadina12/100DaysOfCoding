package dayss095;

import java.util.Scanner;

public class Dayss095 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int m = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int n = in.nextInt();

        System.out.println("Hasil penjumlahan\t: " + penjumlahan(m, n));
        System.out.println("Hasil Pengurangan\t: " + Pengurangan(m, n));
        System.out.println("Hasil Perkalian\t\t: " + Perkalian(m, n));
        System.out.println("Hasil Pembagian\t\t: " + Pembagian(m, n));

    }

    public static int penjumlahan(int b, int c) {
        return b + c;
    }

    public static int Pengurangan(int b, int c) {
        return b - c;
    }

    public static int Perkalian(int b, int c) {
        return b * c;
    }

    public static int Pembagian(int b, int c) {
        return b / c;
    }
}
