
package dayss049;

import java.util.Scanner;

public class Dayss049 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = in.nextInt();
        
        String stt = (nilai >= 80)? "lulus" : "tdk lulus";
        System.out.println("Status nilai anda adalah "+ stt);
    }
    
}
