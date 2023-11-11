package functions;

public class Main {

    public static void main(String[] args) {
        String name = "sasidhar";
        greet(name); //Passing by value and there is no pass by reference in java
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
        name = "Rahul"; //here we are creating new object and assigning it to variable name, but we are not modifying the existing one
    }
}
