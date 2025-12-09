package dayss093;

public class Dayss093 {

    public static void main(String[] args) {
        double angka = 7.6;

        double hasilCeil = Math.ceil(angka);

        double hasilFloor = Math.floor(angka);

        long hasilRound = Math.round(angka);

        System.out.println("Angka awal      : " + angka);
        System.out.println("Math.ceil()    : " + hasilCeil);
        System.out.println("Math.floor()   : " + hasilFloor);
        System.out.println("Math.round()   : " + hasilRound);
    }

}
