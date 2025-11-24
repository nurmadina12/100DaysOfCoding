package dayss078;

public class Dayss078 {

    public static void main(String[] args) {
        String teks = "   Halo Dina   ";

        System.out.println("Teks asli \t\t: (" + teks + ")");

        String t1 = teks.trim();
        System.out.println("Setelah trim \t\t: (" + t1 + ")");

        String t2 = t1.substring(5, 9);
        System.out.println("Setelah substring \t:" + t2);

        String t3 = t1.toLowerCase();
        System.out.println("Setelah toLowerCase \t:" + t3);

        String t4 = t1.toUpperCase();
        System.out.println("Setelah toUpperCase \t:" + t4);

        String t5 = t1.replace("Dina", "Dini");
        System.out.println("Setelah replace \t:" + t5);

        System.out.println("Apakah sama dgn 'Halo Dina'? " + t1.equals("Halo Dina"));
        System.out.println("Apakah sama dgn 'Halo Dina' (tanpa peduli case)?: " + t1.equalsIgnoreCase("halo dina"));
        System.out.println("Apakah mengandung kata 'Dina'?: " + teks.contains("Dina"));

    }

}
