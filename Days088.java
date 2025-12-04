package dayss088;

import java.util.Scanner;

public class Dayss088 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        System.out.println("\nIsi array yang dimasukkan:");
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
