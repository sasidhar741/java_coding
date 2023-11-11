package file_handling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //1st way of creating a stream
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 50);

        //2nd way
        int[] numbers = {10, 20, 30, 40, 50};
        IntStream integerStream1 = Arrays.stream(numbers);

        Product frock = new Product(1, "Frock", 4.0, 500);
        Product watch = new Product(2, "Watch", 4.5, 2000);
        Product shirt = new Product(3, "shirt", 3.7, 700);
        Product violin = new Product(4, "violin", 4.8, 7000);
        List<Product> productsList = Arrays.asList(frock, watch, shirt, violin);

        //Stream methods
        productsList.stream().distinct().forEach(System.out::println);
        System.out.println(productsList.stream().count());
        productsList.stream().limit(2).forEach(System.out::println);

        //reduce function
        double totalPrice = productsList.stream()
                .map(product -> product.getPrice())
                .reduce(0, (p1, p2) -> p1 + p2);

        System.out.println("Total value of products: " + totalPrice);

    }
}
