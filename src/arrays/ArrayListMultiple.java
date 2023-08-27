package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialize the inside arrays
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //adding elements into arrays
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        //printing the elements
        System.out.println(list);
    }
}
