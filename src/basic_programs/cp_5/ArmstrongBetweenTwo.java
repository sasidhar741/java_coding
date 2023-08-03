package basic_programs.cp_5;

import java.util.Scanner;

public class ArmstrongBetweenTwo {

    public static void main(String[] args) {
        System.out.println("Enter the starting number: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();

        for (int i = start + 1; i < end; i++) { //print between ignore start and end
            String numStr = Integer.toString(i);
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += (Math.pow((temp % 10), numStr.length()));
                temp /= 10;

            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}