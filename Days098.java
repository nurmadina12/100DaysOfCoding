package dayss098;

import java.util.Scanner;

public class Dayss098 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int a = 0, b = 1;

        System.out.println("Deret Fibonacci sampai " + N + ":");

        while (a <= N) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

}
