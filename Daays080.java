package dayss080;

public class Dayss080 {

    public static void main(String[] args) {
        int[] angka = {5, 5, 5, 5, 5};
        int jumlah = 0;

        System.out.println("Isi array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
            jumlah += angka[i];
        }

        System.out.println("Jumlah total: " + jumlah);
    }

}
