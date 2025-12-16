package KPD;
import java.util.Scanner;

/**
 * Program untuk mengira gred berdasarkan markah pelajar
 * Menggunakan struktur kawalan if-else-if untuk menentukan gred
 */
public class GredMarkah {
    static Scanner input = new Scanner(System.in);

    /**
     * Fungsi utama program
     * Menerima input nama dan markah pelajar
     * Menentukan gred berdasarkan skala penilaian
     */
    public static void main(String[] args) {
        // Meminta pengguna memasukkan nama
        System.out.println("Masukkan nama:");
        String nama = input.nextLine();
        
        // Meminta pengguna memasukkan markah
        System.out.println("Masukkan markah:");
        double markah = input.nextDouble();
        String gred = ""; // Initialize gred with an empty string

        // Semak jika markah adalah tidak sah (kurang dari 0 atau lebih dari 100)
        if (markah < 0 || markah > 100){
            System.out.println("Markah tak sah, sila masukkan markah mengikut ketetapan yang betul");
        } else if (markah >= 90) {
            // Skala A+: Markah 90 hingga 100
            gred = "A+";
        } else if (markah >= 80) {
            // Skala A: Markah 80 hingga 89
            gred = "A";
        } else if (markah >= 70) {
            // Skala A-: Markah 70 hingga 79
            gred = "A-";
        } else if (markah >= 65) {
            // Skala B: Markah 65 hingga 69
            gred = "B";
        } else if (markah >= 60) {
            // Skala B-: Markah 60 hingga 64
            gred = "B-";
        } else if (markah >= 55) {
            // Skala C: Markah 55 hingga 59
            gred = "C";
        } else if (markah >= 50) {
            // Skala C-: Markah 50 hingga 54
            gred = "C-";
        } else if (markah >= 45) {
            // Skala D: Markah 45 hingga 49
            gred = "D";
        } else if (markah >= 40) {
            // Skala E: Markah 40 hingga 44
            gred = "E";
        } else {
            // Skala G: Markah di bawah 40
            gred = "G";
        }

        // Sekiranya markah adalah sah, cetak keputusan
        if (markah >= 0 && markah <= 100) { // Only print if markah is valid
            System.out.println(nama + " mendapat gred " + gred + " dengan markah " + markah);
        }
    }
}



