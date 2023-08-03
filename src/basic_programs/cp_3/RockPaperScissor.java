package basic_programs.cp_3;

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        System.out.println("Enter 'Rock' OR 'Paper' OR 'Scissor'");

        System.out.println("Enter the computer input: ");
        Scanner sc = new Scanner(System.in);
        String computerChoice = sc.next();

        System.out.println("Enter the user input: ");
        String userChoice = sc.next();

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie");
        } else {
            if (userChoice.equals("Rock") && computerChoice.equals("Paper")) {
                System.out.println("Computer has won");
            } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
                System.out.println("User has won");
            }
            if (userChoice.equals("Paper") && computerChoice.equals("Scissor")) {
                System.out.println("Computer has won");
            } else if (userChoice.equals("Scissor") && computerChoice.equals("Paper")) {
                System.out.println("User has won");
            }

            if (userChoice.equals("Scissor") && computerChoice.equals("Rock")) {
                System.out.println("Computer has won");
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissor")) {
                System.out.println("User has won");
            }

        }
    }
}
