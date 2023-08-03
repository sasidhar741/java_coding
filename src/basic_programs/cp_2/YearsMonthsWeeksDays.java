package basic_programs.cp_2;

import java.util.Scanner;

public class YearsMonthsWeeksDays {

    public static void main(String[] args) {
        System.out.println("Enter the days: ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int years = days / 365;
        days -= years * 365;
        int months = days / 30;
        days -= months * 30;
        int weeks = days / 7;
        days -= weeks * 7;

        System.out.println("Year(s): " + years + " Month(s): " + months + " Week(s): " + weeks + " Day(s): " + days);


    }
}
