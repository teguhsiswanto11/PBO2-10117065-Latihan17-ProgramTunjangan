package pbo2.pkg10117065.latihan17.programtunjangan;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung total gaji berdasarkan status pernikahan
 * dengan ketentuan tunjangan 35%(dari gaji pokok) jika sudah menikah namun 
 * kalau belum maka tidak mendapatkan tunjangan
 * 
 */
public class PBO210117065Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        // deklarasi variabel
        String status;
        double tunj;
        double gaji;
        double gatot;
        //membuat scanner input data
        Scanner scn = new Scanner(System.in);
        
        // menampilkan template program
        System.out.println("********Program Tunjangan********");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scn.nextDouble();
        // input harus huruf kecil semua
        System.out.print("Status Anda? (menikah/belum) :");
        status = scn.next();
        
        // kondisional tunjangan dengan menggunakan ?: 
        tunj=(status.equals("menikah")?0.35*gaji:0);
        // gatot = gaji total
        gatot = gaji+tunj;
        
        // menampilkan hasil setelah perhitungan
        System.out.println("");
        System.out.println("********Hasil Perhitungan********");
        System.out.println("Gaji Pokok\t : Rp "+gaji);
        System.out.println("Tunjangan\t : Rp "+tunj);
        System.out.println("Total gaji\t : Rp "+gatot);
        System.out.println("(Developed by: Teguh Siswanto)");
    }
    
}
