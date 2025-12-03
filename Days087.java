package dayss087;

import java.util.Scanner;

public class Dayss087 {

    public static void main(String[] args) {
        int[] angka = {2, 4, 6, 8, 10};
        Scanner in = new Scanner(System.in);
        System.out.print("Cari angka: ");
        int cari = in.nextInt();

        boolean ketemu = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ketemu = true;
                System.out.println("Angka ditemukan di index ke-" + i);
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Angka tidak ada di array");
        }
    }

}
