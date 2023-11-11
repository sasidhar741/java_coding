package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8);
        fun("sasidhar");//this can be passed as empty also
        //fun();  Ambiguity due to method overloading
        multiple("sasidhar", 22);
    }

    static void fun(int... v) { //variable length arguments, internally uses array
        System.out.println(Arrays.toString(v));
    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(String name, int age, int... v) { //Variable length arguments should be always as last param
        System.out.println(name + " " + age + " " + Arrays.toString(v));
    }
}
