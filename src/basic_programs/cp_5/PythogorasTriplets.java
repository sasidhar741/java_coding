package basic_programs.cp_5;

import java.util.*;

public class PythogorasTriplets {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            for (int j = i + 1; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if ((Math.pow(i, 2) + Math.pow(j, 2)) == Math.pow(k, 2)) {
                        pairs.addAll(Collections.singletonList(Arrays.asList(i, j, k)));
                    }
                }
            }
        }
        System.out.println(pairs);
    }
}
