
package dayss043;

import java.util.Scanner;

public class Dayss043 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int n =in.nextByte();
        
        if (n %3 == 0 && n %5 == 0){
            System.out.println(n + " ini Kelipatan 3 dan 5 ");
        }else if ( n %3 == 0){
            System.out.println(n + " ini Kelipatan 3 ");
        }else if (n %5 == 0){
            System.out.println(n + " ini Kelipatan 5 ");
        }else{
            System.out.println(n + " ini Bkn kelipatan 3 & 5");
        }
    }
    
}
