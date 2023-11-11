package functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 6};
        change(arr); // Passing the copy of the value of reference variable
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] numbers) {
        numbers[0] = 99; // here the original object being changed
    }
}
