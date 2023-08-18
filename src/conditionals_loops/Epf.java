package conditionals_loops;

public class Epf {

    public static void main(String[] args) {
        float amount = 0;
        float interestRate = 0.68f; //pf interest rate 8.15% per annum
        for (int i = 1; i <= 12; i++) {
            amount = amount + (6252 + ((amount * interestRate) / 100));
        }
        System.out.println("Total amount for 12 months: " + amount);
    }
}
