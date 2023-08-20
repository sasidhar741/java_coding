package Functions;

public class Shadowing {
    static int x = 10; // This value is shadowed at line number 9

    public static void main(String[] args) {
        System.out.println(x);
        int x = 99; // The class variable of x at line number 4 is shadowed by this
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
