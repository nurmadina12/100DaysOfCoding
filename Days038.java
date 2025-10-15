
package dayss038;

import java.util.Scanner;

public class Dayss038 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int i = in.nextInt();
        
        if (i>0){
            System.out.println("Positif");
        }else if (i<0){
            System.out.println("Negatif");
        }else{
            System.out.println("Nol");
        }
    }
    
}
