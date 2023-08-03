package basic_programs.cp_1;

public class PrimeNumbers {
    //Program to print first 1000 Prime numbers
    public static void main(String[] args) {
        int ct = 0, n = 0, i = 1, j = 1;
        int sum = 0;
        while (n < 1000) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if (i % j == 0) {
                    ct++;
                }
                j++;
            }
            if (ct == 2) {
                sum += i;
                n++;
            }
            i++;
        }
        System.out.println("Sum of first 1000 prime numbers is " + sum);
    }
}


