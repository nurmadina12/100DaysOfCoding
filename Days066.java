package dayss066;

import java.util.Scanner;

public class Dayss066 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris (N): ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("*");
        }
    }

}
