
package dayss037;

import java.util.Scanner;

public class Dayss037 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan bilangan genap/ganjil : ");
        int n = in.nextInt();
        if (n % 2 == 0){
            System.out.println("ini bilangan Genap");
        }else{
            System.out.println("ini bilangan Ganjil");
        }
    }
    
}
