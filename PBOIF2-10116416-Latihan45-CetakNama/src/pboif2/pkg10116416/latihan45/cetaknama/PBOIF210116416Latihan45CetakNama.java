package pboif2.pkg10116416.latihan45.cetaknama;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program cetak nama
 */
import java.util.Scanner;
import Printer.Printer;
public class PBOIF210116416Latihan45CetakNama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.printf("=====Aplikasi Pencetak Nama=====\n");
        System.out.printf("Masukkan nama anda : "); printer.setNama(scan.nextLine());
        System.out.printf("Mau cetak nama berapa kali? : "); printer.setJmlCetak(scan.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(),printer.getNama());
    }
    
}
