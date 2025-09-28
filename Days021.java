
package duatu;
public class duasatuu {
    public static void main(String[] args) {
        int pertama = 200;
        double kedua =300.3;
        
        System.out.println("Sebelum di Tukar");
        System.out.println("Nilai Pertama= "+ pertama);
        System.out.println("Nilai ke Dua= "+ kedua);
        
        double nilai = pertama;
        pertama = (int)kedua;
        kedua = nilai;
        
        System.out.println("Sesudah di Tukar");
        System.out.println("Nilai Pertama= "+ pertama);
        System.out.println("Nilai ke Dua= "+ kedua);
    }
}
