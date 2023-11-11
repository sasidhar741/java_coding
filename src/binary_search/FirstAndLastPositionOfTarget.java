package binary_search;

import java.util.Arrays;

public class FirstAndLastPositionOfTarget {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = getTargetOccurenceIndex(nums, target, true);
        if (result[0] != -1) {
            result[1] = getTargetOccurenceIndex(nums, target, false);
        }
        return result;
    }

    static int getTargetOccurenceIndex(int[] nums, int target, boolean isFirstOccurence) {
        int targetOccurenceIndex = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                targetOccurenceIndex = mid; //found some potential answer
                if (isFirstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return targetOccurenceIndex;

    }
}
