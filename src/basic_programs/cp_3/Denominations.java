package basic_programs.cp_3;

import java.util.Scanner;

public class Denominations {

    public static void main(String[] args) {
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int fiveHundredsCount = 0, hundredsCount = 0, fiftiesCount = 0, twentiesCount = 0, tensCount = 0, onesCount = 0;
        if (amount >= 500) {
            fiveHundredsCount = amount / 500;
            amount -= (fiveHundredsCount * 500);
        }
        if (amount >= 100) {
            hundredsCount = amount / 100;
            amount -= (hundredsCount * 100);
        }
        if (amount >= 50) {
            fiftiesCount = amount / 50;
            amount -= (fiftiesCount * 50);
        }
        if (amount >= 20) {
            twentiesCount = amount / 20;
            amount -= (twentiesCount * 20);
        }
        if (amount >= 10) {
            tensCount = amount / 10;
            amount -= (tensCount * 10);
        }
        onesCount = amount; // because that will be the remaining amount

        System.out.println("Five hundreds Count: " + fiveHundredsCount);
        System.out.println("Hundreds Count: " + hundredsCount);
        System.out.println("Fifties Count: " + fiftiesCount);
        System.out.println("Twenties Count: " + twentiesCount);
        System.out.println("Tens Count: " + tensCount);
        System.out.println("Ones Count: " + onesCount);

    }
}
