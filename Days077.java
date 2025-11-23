package dayss077;

public class Dayss077 {

    public static void main(String[] args) {
        String teks = "   Halo! nama saya kiki   ";

        System.out.println("Teks asli         : (" + teks + ")");

        String t1 = teks.trim();
        System.out.println("Setelah trim      : (" + t1 + ")");

        String t2 = t1.substring(5, 11);
        System.out.println("Substring (5-11)  : " + t2);

        String t3 = t1.replace("kiki", "Rezky");
        System.out.println("Setelah replace   : " + t3);
    }

}
