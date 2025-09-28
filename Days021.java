
package duatu;
public class duasatuu {
    public static void main(String[] args) {
        int p = 30, K = 20;
        System.out.println("Sebelum di tukar: p = "+ p +", K = "+ K);

        p = p + K;
        K = p - K;
        p = p - K;
        System.out.println("Sesudah di tukar: p = "+ p +", K = "+ K);
    }
}
