package basic_programs.cp_3;

import java.util.Scanner;

public class ElectricityBill {
    // Calculate electricity bill = bill + surcharge
    // <= 50 2 Rs / unit
    // <= 150 3 Rs / Unit
    // <= 250 5 Rs / Unit
    // > 250  8 Rs / Unit
    public static void main(String[] args) {
        System.out.println("Enter the number of units: ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int totalBill = 0;

        if (units <= 50) {
            totalBill = (2 * units);
        } else if (units <= 150) {
            totalBill = ((50 * 2) + (3 * (units - 50)));
        } else if (units <= 250) {
            totalBill = ((50 * 2) + (100 * 3) + (5 * (units - 150)));
        } else if (units > 250) {
            totalBill = ((50 * 2) + (100 * 3) + (100 * 5) + (8 * (units - 250)));
        }
        int surCharge = (totalBill * 20) / 100;
        System.out.println("surcharge: " + surCharge);
        System.out.println("Total Bill: " + (totalBill + surCharge));
    }
}
