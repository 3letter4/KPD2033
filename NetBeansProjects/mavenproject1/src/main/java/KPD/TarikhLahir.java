package KPD;
import java.util.Scanner;

/**
 * Program untuk memproses tarikh lahir dalam format hari, bulan dan tahun
 * Menggunakan struktur kawalan switch untuk menukar nombor bulan kepada nama bulan dalam Bahasa Melayu
 */
public class TarikhLahir {
    
    /**
     * Fungsi utama program
     * Menerima input hari, bulan dan tahun daripada pengguna
     * Menukar nombor bulan kepada nama bulan dalam Bahasa Melayu menggunakan switch
     * Memaparkan tarikh lahir dalam format lengkap
     */
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk menguruskan Scanner secara automatik
        try (Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan hari dan tahun
            System.out.println("Masukkan hari dan tahun (nombor):");
            int hari = input.nextInt(); // Reading day as integer
            int tahun = input.nextInt(); // Reading year as integer
            
            input.nextLine(); // To consume the leftover newline character
            
            // Meminta pengguna memasukkan bulan (dalam nombor atau nama)
            System.out.println("Masukkan bulan (nombor atau nama):");
            String bulan = input.nextLine(); // Reading the month as string
            
            // Enhanced switch untuk menentukan nama bulan dalam Bahasa Melayu
            // Menggunakan switch expression yang baru dalam Java 14+
            String namaBulan = switch (bulan.toLowerCase()) {
                case "1", "januari" -> "Januari";
                case "2", "februari" -> "Februari";
                case "3", "mac" -> "Mac";
                case "4", "april" -> "April";
                case "5", "mei" -> "Mei";
                case "6", "jun" -> "Jun";
                case "7", "julai" -> "Julai";
                case "8", "Ogos" -> "Ogos";
                case "9", "sptember" -> "Sptember";  // Note: This appears to be a typo for "September"
                case "10", "oktober" -> "Oktober";
                case "11", "november" -> "November";
                case "12", "december" -> "Disember";
                default -> "Bulan tidak sah"; // Default case untuk bulan yang tidak sah
            };

            // Cetak tarikh dalam format lengkap jika bulan adalah sah
            if (!namaBulan.equals("Bulan tidak sah")) {
                System.out.println("Tarikh lahir anda: " + hari + " " + namaBulan + " " + tahun);
            } else {
                // Papar mesej ralat jika bulan tidak sah
                System.out.println("Bulan tidak sah. Sila masukkan bulan yang betul.");
            }
        }
    }
}


