package arrays;

import java.util.Arrays;

public class ConcatenateArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] ansArr = new int[numbers.length * 2];
        System.arraycopy(numbers, 0, ansArr, 0, numbers.length);
        System.arraycopy(numbers, 0, ansArr, numbers.length, numbers.length);

        System.out.println(Arrays.toString(ansArr));
    }
}
