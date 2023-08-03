package basic_programs.cp_2;

import java.util.Scanner;

public class KmToMt {

    public static void main(String[] args) {
        System.out.println("Enter the kilometers: ");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();

        System.out.println("Number of mt's for the km's entered: " + km * 1000);
    }
}
