package basic_programs.cp_5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Printing first n fibonacci numbers");

        int n = 5;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
