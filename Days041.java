package evaluasi;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Pilih menu");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng - Rp12.000");
        System.out.println("3. Ayam Bakar - Rp18.000");
        System.out.print("masukkan pilihan menu = ");
        int i = in.nextInt();
        System.out.print("masukkan jumlah porsi = ");
        int n = in.nextInt();
        
        String menu = "";
        double harga = 0;
        if (i==1){
            menu = "Nasi Goreng - Rp15.000";
            harga = 15000;
        }else if (i==2){
            menu = "Mie Goreng - Rp12.000";
            harga = 12000;
        }else if (i ==3){
            menu = "Ayam Bakar - Rp18.000";
            harga = 18000;
        }
         double total = harga*n; 
        if (n > 2 && total > 50000){
            total =total -  (total * 0.1);
        }else if ( total > 50000 || n> 2){
            total =total - (total * 0.05);    
             
        }
        System.out.println("Menu: "+menu);
        System.out.println("Jumlah: "+n);
        System.out.println("total harga: "+total);
    }
 
}
