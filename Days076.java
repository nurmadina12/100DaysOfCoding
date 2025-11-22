package dayss076;

public class Dayss076 {

    public static void main(String[] args) {
        String teks = "Saya Dina";

        System.out.println("Apakah sama dgn 'Saya Dina'? " + teks.equals("Saya Dina"));
        System.out.println("Apakah sama dgn 'Saya Dina' (tanpa peduli case)? " + teks.equalsIgnoreCase("saya dina"));
        System.out.println("Apakah mengandung kata 'Dina'? " + teks.contains("Dina"));
        System.out.println("Apakah string kosong? " + teks.isEmpty());
    }

}
