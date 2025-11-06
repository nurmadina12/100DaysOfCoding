
package dayss060;
public class Dayss060 {
    public static void main(String[] args) {
         int N = 10;
        System.out.println("Angka Ganjil N-1: "+ N);
        for (int i = N; i >= 1; i--) {
            if (i %2 != 0){
                System.out.println(""+i);
            }
            
        }
        System.out.println("Angka Genap N-1: "+N);
        for (int i = N; i >=1; i--) {
            if (i %2 == 0){
                System.out.println(""+i);
            }
            
        }
    }
    
}
