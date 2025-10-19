
package dayss041;

import java.util.Scanner;

public class innfix {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double GajiPokok = 6000000;
        double TunjanganMakan = 40000;
        double Pajak = 0.06;
        
        System.out.print("Masukkan hari kerja : ");
        int HariKerja = in.nextInt();
        
        double TotalTunjanganMakan = TunjanganMakan * HariKerja;
        double TotalGajiKotor = TotalTunjanganMakan + GajiPokok;
        double TotalPajak = TotalGajiKotor * Pajak;
        double TotalGajiBersih = TotalGajiKotor - TotalPajak;
        
        System.out.println("Total gaji bersih : "+TotalGajiBersih);
    }
}
