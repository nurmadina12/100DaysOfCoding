package dayss074;

import java.util.Scanner;

public class Dayss074 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. ikan");
            System.out.println("2. nasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            p = in.nextInt();

            switch (p) {
                case 1:
                    System.out.println("Anda memilih ikan");
                    break;
                case 2:
                    System.out.println("Anda memilih nasi");
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

            System.out.println();
        } while (p != 3);

    }

}
