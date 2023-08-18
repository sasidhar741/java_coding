package basic_programs.cp_3;

import java.util.Scanner;

public class PossibleNumberOfHandShakes {

    public static void main(String[] args) {
        System.out.println("Enter the number of people in the room: ");
        Scanner sc = new Scanner(System.in);
        int peopleCount = sc.nextInt();
        int numberOfHandShakes = 0;

//        Note: Instead of while loop for loop also works
//        while (peopleCount > 0) {
//            peopleCount -= 1;
//            numberOfHandShakes += peopleCount;
//        }

        for (int i = 1; i < peopleCount; i++) {
            numberOfHandShakes += (peopleCount - i);
        }
        System.out.println("NumberOfHandshakes: " + numberOfHandShakes);

        // Direct Formula: (n * (n-1)) / 2

    }
}
