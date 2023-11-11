package file_handling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Product {

    private int id;
    private String name;

    private double rating;

    private int price;

    public Product() {
    }

    public Product(int id, String name, double rating, int price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}

class ProductRunner {
    public static void main(String[] args) {
        Product frock = new Product(1, "Frock", 4.0, 500);
        Product watch = new Product(2, "Watch", 4.5, 2000);
        Product shirt = new Product(3, "shirt", 3.7, 700);
        Product violin = new Product(4, "violin", 4.8, 7000);
        List<Product> productsList = Arrays.asList(frock, watch, shirt, violin);

        System.out.println("Total products: ");
        productsList.forEach(System.out::println);
        System.out.println("Products with rating greater than 4: ");
        evaluate(productsList, p -> p.getRating() > 4);

        System.out.println("Products with price greater than 500: ");
        evaluate(productsList, p -> p.getPrice() > 500);

        List<Product> filteredProducts = productsList.stream().filter(product -> product.getName().startsWith("s")).map(product -> product).toList();
        System.out.println("Filtered products: " + filteredProducts);
        productsList.stream()
                .filter(product -> product.getRating() > 3)
                .sorted(Comparator.comparingDouble(Product::getRating))
                .forEach(System.out::println);

    }

    public static void evaluate(List<Product> products, Predicate<Product> predicate) {
        for (Product p : products) {
            if (predicate.test(p)) {
                System.out.println(p.getName());
            }
        }
    }
}
