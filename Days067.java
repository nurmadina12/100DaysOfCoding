package dayss067;

import java.util.Scanner;

public class Dayss067 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
