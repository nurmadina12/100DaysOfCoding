package days091;

public class Days091 {

    public static void main(String[] args) {
        NamaSaya("Nurmadina");
        int hasil = kali(2, 3);
        System.out.println("hasil kali (2*3) adalah: " + hasil);
    }

    public static void NamaSaya(String n) {
        System.out.println("Nama saya adalah: " + n);

    }

    public static int kali(int a, int b) {
        return a * b;

    }
}
