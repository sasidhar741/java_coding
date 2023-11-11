package linear_search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "sasidhar";
        boolean searchResult = search(name, 'd');
        System.out.println("Does character specified exist: " + searchResult);
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (target == c) {
                return true;
            }
        }
        return false;
    }
}
