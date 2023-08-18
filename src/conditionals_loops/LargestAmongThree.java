package conditionals_loops;

import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int max = Math.max(third, Math.max(first, second));
        System.out.println("Largest among three: " + max);
    }
}
