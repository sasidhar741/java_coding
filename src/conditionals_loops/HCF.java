package conditionals_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the n2: ");
        int n2 = sc.nextInt();

        int hcf = 1;

        for (int i = hcf; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF: " + hcf);
    }
}
