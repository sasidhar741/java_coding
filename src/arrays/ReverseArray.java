package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int start = 0, end = (numbers.length - 1);
             start < end;
             start++, end--) {

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
