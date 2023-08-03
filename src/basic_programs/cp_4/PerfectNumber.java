package basic_programs.cp_4;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("It's a perfect number");
        } else {
            System.out.println("It's not a perfect number");
        }
    }
}
