package functional.ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2000.0));
        list.add(new Product("TV", 1200.0));
        list.add(new Product("Phone", 400.0));
        list.add(new Product("Cup", 10.0));
        list.add(new Product("Glass", 20.0));

        double avg = list.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum) / list.size();

        System.out.println("Average price: " + avg);

        List<String> newList = list.stream()
                .filter(product -> product.getPrice() < avg)
                .map(Product::getName)
                .sorted(Comparator.reverseOrder())
                .toList();

        newList.forEach(System.out::println);
    }
}
