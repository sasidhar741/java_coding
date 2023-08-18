package conditionals_loops;

public class Cgpa {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70, 80, 90} ;
        float totalGradeSum = 0;
        for (int i = 0; i < marks.length; i++) {
            float grade = marks[i] / 10;
            totalGradeSum += grade;
        }
        float cGpa = totalGradeSum / marks.length;
        System.out.println("Total grade CGPA: " + cGpa);
        System.out.println("CGPA percentage: " + String.format("%.2f", cGpa * 9.5));
    }
}
