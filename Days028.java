
package days028;

import java.util.Scanner;

public class Days028 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.print("Masukkan angka1 : ");
        int b = i.nextInt();
        System.out.print("Masukkan angka2 : ");
        int c = i.nextInt();
        
        System.out.println(" angka1 sama dengan angka2 "+ (b==c));
        System.out.println(" angka1 tidak dengan angka2 "+ (b!=c));
        
    }
    
}
