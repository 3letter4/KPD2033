package KPD;
import java.util.Scanner;

public class TarikhLahir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan hari dan tahun (nombor):");
            int hari = input.nextInt(); // Reading day as integer
            int tahun = input.nextInt(); // Reading year as integer
            
            input.nextLine(); // To consume the leftover newline character
            
            System.out.println("Masukkan bulan (nombor atau nama):");
            String bulan = input.nextLine(); // Reading the month as string
            
            // Enhanced switch to determine the month in Malay
            String namaBulan = switch (bulan.toLowerCase()) {
                case "1", "januari" -> "Januari";
                case "2", "februari" -> "Februari";
                case "3", "mac" -> "Mac";
                case "4", "april" -> "April";
                case "5", "mei" -> "Mei";
                case "6", "jun" -> "Jun";
                case "7", "julai" -> "Julai";
                case "8", "Ogos" -> "Ogos";
                case "9", "sptember" -> "Sptember";
                case "10", "oktober" -> "Oktober";
                case "11", "november" -> "November";
                case "12", "december" -> "Disember";
                default -> "Bulan tidak sah"; // Default case
            };

            // Print the formatted date if the month is valid
            if (!namaBulan.equals("Bulan tidak sah")) {
                System.out.println("Tarikh lahir anda: " + hari + " " + namaBulan + " " + tahun);
            } else {
                System.out.println("Bulan tidak sah. Sila masukkan bulan yang betul.");
            }
        }
    }
}


