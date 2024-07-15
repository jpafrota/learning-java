package files;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        String root = System.getProperty("user.dir");
        String pathToCsv = root + File.separator + "products.csv";
        String newCsvPath = root + File.separator + "products-new.csv";

        // read file
        try (BufferedReader bfr = new BufferedReader(new FileReader(pathToCsv))) {
            String line = bfr.readLine();

            StringBuilder sbr = new StringBuilder();
            while (line != null) {
                String[] productInfo = line.split(",");
                System.out.println(Arrays.toString(productInfo));

                sbr.append(productInfo[0])
                        .append(", ")
                        .append(String.format(Locale.ENGLISH, "%.2f", Double.parseDouble(productInfo[1]) * Double.parseDouble(productInfo[2])))
                        .append("\n");

                line = bfr.readLine();
            }

            // Write to file
            try (BufferedWriter bfw = new BufferedWriter(new FileWriter(newCsvPath))) {
                System.out.println(sbr.toString());
                bfw.write(sbr.toString());
            }
        } catch (IOException e) {
            // dfsf
        }
    }
}
