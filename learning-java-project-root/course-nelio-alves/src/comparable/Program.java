package comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("asdaf", 13000.0));
        empList.add(new Employee("asdad", 12000.0));
        empList.add(new Employee("asdag", 15000.0));
        empList.add(new Employee("asdah", 1000.0));

        empList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
