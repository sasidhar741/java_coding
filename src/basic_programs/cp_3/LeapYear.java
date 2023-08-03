package basic_programs.cp_3;

import java.util.Scanner;

public class LeapYear {
    // Leap year explanation detailed
    //https://www.mathsisfun.com/leap-years.html
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
