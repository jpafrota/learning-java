package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Jorge");
        list.add("Jhon");

        // Interface implementation with anonymous class (old ugly way)
        // note: we could implement in a separate class and just use 'new CustomPredicate()'
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hugo");
            }
        });

        // Method reference to a static method
        list.removeIf(Program::doesNotHaveJ);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.stream().map(number -> number * 2).forEach(System.out::println);

        list.stream().map(string -> string.charAt(0)).forEach(System.out::println);

        // Method reference to non-static method of a particular type
        // Note: we could also reference a non-static method from an object instance.
        list.removeIf(String::isEmpty);

        String instance = "J";
        list.removeIf(instance::contains);

        // Declared lambda expression
        Predicate<String> predicate = string -> string.isEmpty();
        list.removeIf(predicate);

        // Inline lambda expression
        list.removeIf(string -> string.compareTo("J") > 0);
    }

    static boolean doesNotHaveJ(String j) {
        return j.contains("J");
    }
}
