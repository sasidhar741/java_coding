package basic_programs.cp_3;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numStr = Integer.toString(num);
        int sum = 0;

        while (num != 0) {
            sum += Math.pow((num % 10), numStr.length());
            num /= 10;
        }

        if (sum == Integer.parseInt(numStr)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
