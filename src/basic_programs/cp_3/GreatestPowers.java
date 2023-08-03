package basic_programs.cp_3;

import java.util.Scanner;

public class GreatestPowers {

    public static void main(String[] args) {
        System.out.println("Enter the base: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();

        int aPowerB = (int) Math.pow(base, exponent);
        int bpowerA = (int) Math.pow(exponent, base);

        if (aPowerB > bpowerA) {
            System.out.println(" Greatest power is a Power B: " + aPowerB);
        } else {
            System.out.println(" Greatest power is b Power A: " + bpowerA);
        }

        System.out.println("Absolute difference: " + Math.abs((base - exponent))); //not related to this question
    }
}
