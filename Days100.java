
package dayss100;

import java.util.Scanner;

public class Daysss100 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan string str: ");
        String str = input.nextLine();

        boolean adaI = false;
        boolean adaS = false;
        boolean cantik = false;

        for (int i = 0; i < str.length(); i++) {
             char c = str.charAt(i);
             
             if (c == 'I') {
                 adaI = true;
                
            }else if (c == 'S' && adaI){
                adaS = true;
                
            }else if (c == 'C' && adaI && adaS){
                cantik = true;
                
            }
        }
        if (cantik) {
            System.out.println("CANTIK");
            
        }else{
            System.out.println("TIDAK CANTIK");
        }
           

    }
}
