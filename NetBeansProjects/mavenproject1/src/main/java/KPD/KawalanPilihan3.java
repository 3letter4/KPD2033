package KPD;

public class KawalanPilihan3 {
    public static void main(String[] args) {
        double markah = 90;
        String gred = "Undefined"; 

        if (markah >= 90) {
            gred = "+A";
        } else if (markah >= 80) {
            gred = "A";
        } else if (markah >= 70) {
            gred = "-A";
        }

        System.out.print(gred);
    }
}