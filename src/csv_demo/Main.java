package csv_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Object> demo = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("./src/csv_demo/test.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        scanner.useDelimiter(",");

        while (scanner.hasNext())
        {
            demo.add(scanner.nextLine());
        }
        System.out.println(demo);
        System.out.println(demo.size());

        scanner.close();
    }
}
