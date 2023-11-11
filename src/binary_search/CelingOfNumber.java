package binary_search;

public class CelingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 16, 18, 22, 45, 89};
        int searchResult = ceiling(arr, 17);
        System.out.println(searchResult);
    }

    static int ceiling(int[] arr, int target) {
        if (arr.length == 0 || target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid; //returning the element equal to the target
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start; // returning the element greaterThan to target
    }
}
