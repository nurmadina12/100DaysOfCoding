package days047;

import java.util.Scanner;

public class Dayss047 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1-7 untuk menentukan hari : ");
        int nohari = in.nextInt();
        String NamaHari;
        
        switch (nohari) {
            case 1:
                NamaHari = "Hari Senin";
                break;
            case 2:
                NamaHari = "Hari Selasa";
                break;
            case 3:
                NamaHari = "Hari Rabu";
                break;
            case 4:
                NamaHari = "Hari Kamis";
                break;
            case 5:
                NamaHari = "Hari Jumat";
                break;
            case 6:
                NamaHari = "Hari Sabtu";
                break;
            case 7:
                NamaHari = "Hari Minggu";
                break;
            default:
                NamaHari = " Nomor Hari Tidak valid";
        }
        System.out.println("Hari ke- "+ nohari +" adalah "+ NamaHari);
    }

}
