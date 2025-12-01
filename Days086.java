package days086;

import java.util.Scanner;

public class Days086 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();
        
        int [] ar = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka- "+ (i + 1)+": ");
            ar[i]=in.nextInt();          
            
        }
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i]<min) {
                min = ar[i];
            }            
            
        }
        System.out.println("Angka minimal: "+ min);
    }

}
