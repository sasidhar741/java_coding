package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; // Not mandatory to add number of cols
        int[][] numbers = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Length: " + numbers.length); //Gives the length as number of rows

        //Taking input of 2-d array [Matrix]
        for (int row = 0; row < arr.length; row++) { //Iterating rows
            //Again Each row will be having a array known as cols
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //printing 2-d array [Matrix]
        for (int row = 0; row < arr.length; row++) { //Iterating rows
            //Again Each row will be having a array known as cols
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //printing 2-d array [Matrix] - Enhanced for loop
        for (int[] rows : arr) { //Iterating rows
            //Again Each row will be having a array known as cols
            for (int cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        //printing 2-d array [Matrix] - Arrays.toString() method

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
