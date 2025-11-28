package dayss082;

import java.util.Scanner;

public class Dayss082 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai array: ");
        int n = in.nextInt();
        
        int[] d = new int[n];

        for (int i = 0; i < d.length; i++) {
            System.out.print("Input nilai ke-" + i + ": ");
            d[i] = in.nextInt();
        }

        System.out.println("Isi array:");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

}
