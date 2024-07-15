package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String line = "1 2    4";
        String[] parts;

        parts = line.split(" +");

        System.out.println(Arrays.toString(parts));

    }
}
