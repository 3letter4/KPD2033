package KPD;
import java.util.Scanner;

public class GredMarkah {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukkan nama:");
        String nama = input.nextLine();
        System.out.println("Masukkan markah:");
        double markah = input.nextDouble();
        String gred;
        
        if (markah >= 90) {
            gred = "A+";
        } else if (markah >= 80) {
            gred = "A";
        } else if (markah >= 70) {
            gred = "A-";
        } else if (markah >= 65) {
            gred = "B";
        } else if (markah >= 60) {
            gred = "B-";
        } else if (markah >= 55) {
            gred = "C";
        } else if (markah >= 50) {
            gred = "C-";
        } else if (markah >= 45) {
            gred = "D";
        } else if (markah >= 40) {
            gred = "E";
        } else {
            gred = "G";
        }

        // Fixed concatenation by adding '+' operators
        System.out.println(nama + " mendapat gred " + gred + " dengan markah " + markah);
    }
}



