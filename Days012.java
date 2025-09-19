
package duabelas;

import java.util.Scanner;

public class kelasinaaaaaaaaaaaad {
    public static void main(String[] args) {
        Scanner Biodata = new Scanner(System.in);
        System.out.println("BiodataSederhana");
        
        System.out.println("Nama ");
        String Nama = Biodata.nextLine();
        System.out.println("Umur ");
        byte Umur = Biodata.nextByte();
        System.out.println("TanggalLahir ");
        short TanggalLahir = Biodata.nextShort();
        System.out.println("Wa ");
        long Wa = Biodata.nextLong();
        System.out.println("TahunLahir ");
        int TahunLahir = Biodata.nextInt();
        System.out.println("BeratBadan ");
        double BeratBadan = Biodata.nextDouble();
        System.out.println("TinggiBadan ");
        float TinggiBadan = Biodata.nextFloat();
        System.out.println("JenisKelamin ");
        char JenisKelamin = Biodata.next ().charAt(0);
        System.out.println("Perempuan ");
        boolean Perempuan = Biodata.nextBoolean();
        
    }
}
