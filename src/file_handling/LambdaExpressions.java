package file_handling;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Frock", "Watch", "Shirt", "Violin");

        //Ascending order
        products.sort((String p1, String p2) -> p1.compareTo(p2));
        products.sort(String::compareTo); //Method reference for the above statement

        //Descending order
        products.sort((product1, product2) -> product2.compareTo(product1));

        for (String productName : products) {
            System.out.println(productName);
        }

    }
}
