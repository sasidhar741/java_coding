package conditionals_loops;

import java.util.Scanner;

public class DepreciationOfValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        int v1 = sc.nextInt();

        System.out.println("Enter the rate of depreciation: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();


        for (int i = 1; i <= years; i++) {
            v1 -= ((v1 * r) / 100);
        }

        System.out.println("Depreciation value: " + v1);
    }
}
