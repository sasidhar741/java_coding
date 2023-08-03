package basic_programs.cp_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountString {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        Map<Character, Integer> characterCounts = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            Character c = name.charAt(i);
            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            } else {
                characterCounts.put(c, 1);
            }
        }
        System.out.println(characterCounts);
    }
}
