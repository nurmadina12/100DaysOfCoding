package dayss031;

import java.util.Scanner;

public class Dayss031 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan umur : ");
        System.out.print("umur : ");
        int i = n.nextInt();

        if (i > 18 && i < 35) {
            System.out.println("Bisa daftar CPNS ");
        } else {
            System.out.println("Tidak bisa daftar ");
        }

    }
}
