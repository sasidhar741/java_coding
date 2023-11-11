package functions;

import java.util.Scanner;

public class DisplayGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int subjectsCount = sc.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < subjectsCount; i++) {
            System.out.println("Enter the marks: ");
            int subjectMarks = sc.nextInt();
            totalMarks += subjectMarks;
        }
        showGrade(totalMarks, subjectsCount);
    }

    static void showGrade(int totalMarks, int subjectsCount) {
        int marksPercentage = (totalMarks * 100) / (subjectsCount * 100); //to calculate percentage - value * 100 / TotalValue
        switch (marksPercentage / 10) {
            case 10 -> System.out.println("Ex");
            case 9 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            default -> System.out.println("Fail");
        }
    }
}
