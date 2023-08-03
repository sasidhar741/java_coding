package basic_programs.cp_5;

public class FibonacciNValue {

    public static void main(String[] args) {
        System.out.println("Printing fibonacci series till n value");

        int n = 5;
        int first = 0;
        int second = 1;
        int nextTerm = 0;

        while (nextTerm <= n) {
            System.out.print(first + " ");
            nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

    }
}
