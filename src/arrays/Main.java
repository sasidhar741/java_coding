package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids; //Declaration of an array with ids as reference variable in stack memory: compile time
        ids = new int[5]; //initialization: actually the object is being created in the heap memory: run time
        int[] rollNos = {10, 20, 30, 40, 50};

        //printing using For each loop
        for (int rollNumber : rollNos) {
            System.out.print(rollNumber + " ");
        }

        System.out.println();
        //printing using Arrays class
        System.out.println(Arrays.toString(rollNos)); //internally uses for loop itself
    }
}
