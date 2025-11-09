package dayss063;

import java.util.Scanner;

public class Dayss063 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int h = 1;

        for (int i = 1; i <= N; i++) {
            h = h * i;
        }

        System.out.println("Hasil perkalian 1 sampai " + N + " adalah: " + h);
    }

}
