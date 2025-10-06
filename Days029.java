
package dayss029;

import java.util.Scanner;

public class Dayss029 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        long k = i.nextLong();
        System.out.print("Masukkan angka : ");
        long l = i.nextLong();
        
        System.out.println("Hasil k lebih dari l : "+ (k>l));
        System.out.println("Hasil k kurang dari l : "+ (k<l));
    }
    
}
