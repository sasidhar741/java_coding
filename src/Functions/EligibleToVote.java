package functions;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println("Is eligible to Vote: " + isEligibleToVote(age));
    }

    static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
