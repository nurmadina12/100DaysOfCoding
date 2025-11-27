package dayss081;

import java.util.Scanner;

public class Dayss081 {

    public static void main(String[] args) {
        int[] nilai = {20, 30, 40, 50, 60};
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Array: 20, 30, 40, 50, 60 ");
        for (int i = 0; i < nilai.length; i++) {
        }
        System.out.print("\nMasukkan indeks: ");
        int ib = input.nextInt();

        if (ib >= 0 && ib < nilai.length) {
            System.out.println("Nilai pada indeks " + ib + " adalah: " + nilai[ib]);
        } else {
            System.out.println("tidak valid! " + (nilai.length - 1));
        }
    }

}
