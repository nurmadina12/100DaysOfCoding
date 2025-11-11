package dayss065;

import java.util.Scanner;

public class Dayss065 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        System.out.println("Faktorial dari " + N + " adalah: " + hasil);
    }

}
