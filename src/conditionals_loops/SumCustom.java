package conditionals_loops;

import java.util.Scanner;

public class SumCustom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativeSum = 0, positiveEvenSum = 0, positiveOddSum = 0;
        while (true) {
            System.out.println("Enter the input: ");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            if (input < 0) {
                negativeSum += input;
            } else if (input % 2 == 0) {
                positiveEvenSum += input;
            } else {
                positiveOddSum += input;
            }
            
        }
        System.out.println("+ Even sum: " + positiveEvenSum + "\n" + "+ Odd sum: " + positiveOddSum + "\n" + "Negative sum: " + negativeSum);
    }
}
