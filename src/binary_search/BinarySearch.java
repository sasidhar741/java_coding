package binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int searchResult = binarySearch(arr, 18);
        System.out.println(searchResult);
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                //here target element and middle element are same.
                return mid; // returning the index of answer
            }

        }
        return -1; // if element not found
    }
}
