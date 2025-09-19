
//Hari ke 12 Latihan: Membuat Program Biodata Sederhana.


package duabelas;
import java.util.Scanner;

public class kelasinaaaaaaaaaaaad {
    public static void main(String[] args) {
        Scanner Biodata = new Scanner(System.in);
        System.out.println("BiodataSederhana");
        
        System.out.println("NamaSaya ");
        String NamaSaya= Biodata.nextLine();
        System.out.println("SayaBerumur ");
        byte SayaBerumur = Biodata.nextByte();
        System.out.println("SayaLahirPadaTanggal ");
        short SayaLahirPadaTanggal = Biodata.nextShort();
        System.out.println("NomorWaSaya ");
        long NomorWaSaya = Biodata.nextLong();
        System.out.println("SayaLahirPadaTahun ");
        int SayaLahirPadaTahun = Biodata.nextInt();
        System.out.println("BeratBadanSaya ");
        double BeratBadanSaya = Biodata.nextDouble();
        System.out.println("TinggiBadanSaya ");
        float TinggiBadanSaya = Biodata.nextFloat();
        System.out.println("JenisKelaminSaya ");
        char JenisKelaminSaya = Biodata.next ().charAt(0);
        
        System.out.println("HasilInputan String "+ (NamaSaya));
        System.out.println("HasilInputan byte "+ (SayaBerumur));
        System.out.println("HasilInputan short "+ (SayaLahirPadaTanggal));
        System.out.println("HasilInputan long "+ (NomorWaSaya));
        System.out.println("HasilInputan int "+ (SayaLahirPadaTahun));
        System.out.println("HasilInputan double "+ (BeratBadanSaya));
        System.out.println("HasilInputan float "+ (TinggiBadanSaya));
        System.out.println("HasilInputan char "+ (JenisKelaminSaya));
    }
}
