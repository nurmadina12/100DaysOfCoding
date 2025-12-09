package dayss097;

import java.util.Scanner;

public class Dayss097 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int s = input.nextInt();

        int luas = hitungLuas(s);

        System.out.println("Luas persegi adalah: " + luas);
    }
     public static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

}
