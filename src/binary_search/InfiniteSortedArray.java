package binary_search;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 35, 40, 47, 53, 60};
        System.out.println(infiniteSortedArray(arr, 47));
    }

    static int infiniteSortedArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = ((end - start) + 1) * 2;
            start = temp;
        }
        return infiniteBinarySearch(arr, target, start, end);
    }

    static int infiniteBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }
}
