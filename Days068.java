
package dayss068;

import java.util.Scanner;

public class Dayss068 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi (N): ");
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {          
            for (int j = 1; j <= N; j++) {    
                System.out.print("*");
            }
            System.out.println();            
        }
    }
    
}
