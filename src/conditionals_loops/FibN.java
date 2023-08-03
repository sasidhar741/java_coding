package conditionals_loops;

import java.util.Scanner;

//Nth index starts from Zero
public class FibN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        if (n == 0) {
            System.out.println("N^th fibonacci value: 0");
            return;
        }
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println("N^th fibonacci value: " + b);
    }
}
