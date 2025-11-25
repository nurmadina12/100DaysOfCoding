package dayss079;

import java.util.Scanner;

public class Dayss079 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user, pass;
        String loginUser, loginPass;

        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat username: ");
        user = in.nextLine();
        System.out.print("Buat password: ");
        pass = in.nextLine();
        System.out.println("\nAkun berhasil dibuat!\n");
        System.out.println("=== LOGIN ===");

        while (true) {
            System.out.print("Username: ");
            loginUser = in.nextLine();
            System.out.print("Password: ");
            loginPass = in.nextLine();

            if (loginUser.equals(user) && loginPass.equals(pass)) {
                System.out.println("\nLogin berhasil! Selamat datang, " + user + "!");
                break;
            } else {
                System.out.println("Username atau password salah, coba lagi!\n");
            }
        }
    }

}
