import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Erro01 {


	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		list = list.stream().filter(x -> x % 2 ==0).collect(Collectors.toList());

		System.out.println("Hello World Erro01");
	}
}