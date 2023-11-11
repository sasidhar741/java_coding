package strings;

import java.io.Console;

public class Main {
    public static void main(String[] args) {

        //String buffer is mutable and synchronized
        StringBuffer s = new StringBuffer("sasidhar ");
        String fullName = s.append("Reddy Dasireddygari").toString(); //we r using toString() to convert from stringbuffer to string
        System.out.println(fullName);

        //String builder is faster than string buffer and string
        //String builder is non synchronized - means two threads can access strinbuilder simultaneously
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        String greetings = stringBuilder.append("World").toString();
        System.out.println(greetings);

        //reads the password from user by hiding from user
        Console console = System.console();
        if (console == null) {
            System.out.println(
                    "No console available");
            return;
        }
        String password = String.valueOf(console.readPassword("Password :"));
        System.out.println("Password you entered: " + password);

    }
}
