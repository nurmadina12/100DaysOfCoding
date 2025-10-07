
package dayss030;

import java.util.Scanner;

public class Dayss030 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        byte pertama = i.nextByte();
        System.out.print("Masukkan angka kedua : ");
        byte kedua = i.nextByte();
        
        System.out.println("Hasil pertama kurang dari kedua "+ (pertama <= kedua));
        System.out.println("Hasil pertama lebih dari kedua "+ (pertama >= kedua));
    }
    
}
