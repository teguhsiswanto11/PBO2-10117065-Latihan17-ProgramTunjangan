package pbo2.pkg10117065.latihan17.programtunjangan;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : 
 * 
 */
public class PBO210117065Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        String status;
        double tunj;
        double gaji;
        double gatot;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("********Program Tunjangan********");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scn.nextDouble();
        System.out.print("Status Anda? (menikah/belum) :");
        status = scn.next();
        
        tunj=(status.equals("menikah")?0.35*gaji:0);

        gatot = gaji+tunj;
        
        System.out.println("");
        System.out.println("********Hasil Perhitungan********");
        System.out.println("Gaji Pokok\t : Rp "+gaji);
        System.out.println("Tunjangan\t : Rp "+tunj);
        System.out.println("Total gaji\t : Rp "+gatot);
        System.out.println("(Developed by: Teguh Siswanto)");
    }
    
}
