package dayss064;

import java.util.Scanner;

public class Dayss064 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai B: ");
        int B = input.nextInt();

        System.out.print("Masukkan nilai P (Pangkatnya): ");
        int P = input.nextInt();

        int hasil = 1;
        for (int i = 1; i <= P; i++) {
            hasil = hasil * B;
        }

        System.out.println(B + " pangkat " + P + " = " + hasil);
    }

}
