
package days033;

import java.util.Scanner;

public class Days033 {
    public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
        System.out.print("Masukkan Uang : ");
        byte UangSaya = n.nextByte();
        
        if (UangSaya != 50){
            System.out.println("Uang saya sama dengan 50! ");
        }else{
            System.out.println("Uang saya tidak sama dengan 50! ");
        }
    }
    
}
