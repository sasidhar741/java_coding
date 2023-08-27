package arrays;

import java.util.Arrays;

public class RunningSum3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        //using single loop - efficient one
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i] + numbers[i - 1];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }

    //using double loops
    static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] += nums[j];
            }
        }
        return runningSum;
    }
}
