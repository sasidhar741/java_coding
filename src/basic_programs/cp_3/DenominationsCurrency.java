package basic_programs.cp_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DenominationsCurrency {

    public static void main(String[] args) {

        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        List<Integer> notes = Arrays.asList(500, 100, 50, 20, 10, 5, 2, 1);
        List<Integer> noteCounter = new ArrayList<>();

        for (int i = 0; i < notes.size(); i++) {
            if (amount >= notes.get(i)) {
                noteCounter.add(amount / notes.get(i));
                amount -= (noteCounter.get(i) * notes.get(i));
            } else {
                noteCounter.add(0);
            }
        }
        System.out.println(notes);
        System.out.println(noteCounter);
    }
}
