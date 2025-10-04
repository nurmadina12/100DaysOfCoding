
package days027.java;

import java.util.Scanner;

public class Days027Java {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("");
        int a = in.nextInt();       
        System.out.println("");
        int b = in.nextInt();
        
        a = a+b;
        b = a-b;
        a = a-b;

        
        System.out.println("Nilai variabel a setelah di tukar "+a);
        System.out.println("Nilai variabel b setelah di tukar "+b);
        
    }
    
}
