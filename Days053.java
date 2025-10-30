
package dayss053;

import java.util.Scanner;

public class Dayss053 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        while (true) { 
            System.out.print("Masukkan kata (ketik 'stop' untuk keluar): ");
            String input = in.nextLine();
            
            if (input.equalsIgnoreCase("stop")) {
                break; 
            }
            System.out.println("Anda mengetik: " + input);
        }
    }
    
}
