package linear_search;

public class FindEvenDigitsCount {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, -7896};
        System.out.println(findEven(numbers));

    }

    static int findEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (doesItContainsEvenNumberOfDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean doesItContainsEvenNumberOfDigits(int num) {
        if (num == 0) {
            return false;
        }
        if (num < 0) {
            num *= -1;
        }
        int digitsCount = 0;
        while (num > 0) {
            digitsCount++;
            num /= 10;
        }
        return digitsCount % 2 == 0;
    }
}
