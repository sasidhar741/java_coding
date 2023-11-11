package switch_cases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = sc.next();

        switch (fruit) { // old style switch statement
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            case "Mango":
                System.out.println("King of fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }

        System.out.println("Enter the day number to find whether weekday or weekend: ");
        int day = sc.nextInt();

        switch (day) { // new style switch statement (enhanced switch)
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            default -> System.out.println("Enter a valid input"); // it can be kept in middle
            case 6, 7 -> System.out.println("Weekend");

        }
    }
}