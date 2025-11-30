
package dayss0844;

import java.util.Scanner;

public class Dayss0844 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        System.out.println("Masukkan teks");
        String nama = input.nextLine();

        System.out.println("Masukkan angka");
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            System.out.println(nama);
        }
    }
    
}
