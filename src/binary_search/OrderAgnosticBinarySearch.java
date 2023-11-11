package binary_search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 15, 16, 18, 20, 22, 45, 89};
        int[] descArr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 20;
        int searchResult = orderAgnosticBS(arr, target);
        int searchResult2 = orderAgnosticBS(descArr, target);
        System.out.println(searchResult);
        System.out.println(searchResult2);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is in ascending order or not
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
