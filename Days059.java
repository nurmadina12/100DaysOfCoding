
package dayss059;
public class Dayss059 {
    public static void main(String[] args) {
        int N = 10;
        System.out.println("Angka Ganjil 1-N: "+ N);
        for (int i = 0; i <= N; i++) {
            if (i %2 == 1){
                System.out.println(""+i);
            }
            
        }
        System.out.println("Angka Genap 1-N: "+N);
        for (int i = 0; i <=N; i++) {
            if (i %2 == 0){
                System.out.println(""+i);
            }
            
        }
    }
    
}
