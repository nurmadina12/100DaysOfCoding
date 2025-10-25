
package dayss048;

import java.util.Scanner;

public class Dayss048 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        double per = in.nextDouble();
        System.out.print("Masukkan operator (+,-,*,/) : "  );
        char op = in.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        double dua = in.nextDouble();
        
        double h = 0;
        switch (op){
            case '+':
                h = per + dua;
                break;
            case '-':
                h = per - dua;
                break;
            case '*':
                h = per * dua;
                break;
            case '/':
                if (dua != 0){
                    h = per / dua;
                }else{
                    System.out.println("tdk bisa membagi dgn nol");
                }
                break;
            default:
                System.out.println("operator tdk valid");
        }
        System.out.println("Hasilnya adalah : "+ h);
    }
    
}
