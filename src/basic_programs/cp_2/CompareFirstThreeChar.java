package basic_programs.cp_2;

import java.util.Scanner;

public class CompareFirstThreeChar {

    public static void main(String[] args) {
        System.out.println("Enter the first string: ");
        Scanner sc = new Scanner(System.in);
        String first = sc.next();

        System.out.println("Enter the second string: ");
        String second = sc.next();

        if (first.length() < 3 || second.length() < 3) {
            System.out.println("Should consist of atleast 3 char");
        } else {
            boolean areEqual = (first.substring(0, 3)).equals(second.substring(0, 3));
            System.out.println("Are two strings equal: " + areEqual);
        }
    }
}
