
package dayss083;

import java.util.Scanner;

public class Dayss083 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai array: ");
        int n = in.nextInt();

        int[] d = new int[n];
        int jumlah = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            d[i] = in.nextInt();
            jumlah += d[i];
        }

        System.out.println("Total jumlah: " + jumlah);
    }
    
}
