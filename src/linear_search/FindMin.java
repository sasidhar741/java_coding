package linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {20, 25, 63, 45, 58, 97, 12, 32, 41};
        System.out.println(min(arr));
    }

    static int min(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int minNum = Integer.MAX_VALUE;
        for (int num : numbers) {
            minNum = Math.min(minNum, num);
        }

        return minNum;
    }
}
