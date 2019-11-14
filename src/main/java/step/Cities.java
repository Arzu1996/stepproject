package step;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cities implements Iterable<String> {
    private final List<String> cities = Arrays.asList
            ("New York",
                    "Los Angeles",
                    "Chicago",
                    "Houston",
                    "Phoenix",
                    "Philadelphia",
                    "San Antonio",
                    "San Diego",
                    "Dallas",
                    "San Jose",
                    "Austin",
                    "Jacksonville",
                    "Fort Worth",
                    "Columbus",
                    "San Francisco",
                    "Charlotte",
                    "Indianapolis",
                    "Seattle",
                    "Denver",
                    "Washington",
                    "Boston");

    @Override
    public Iterator<String> iterator() {
        return cities.iterator();
    }

    public void create() {
        try (
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter(new File("src/main/java/step/data/cities.txt")))
        ) {
            cities.forEach(c -> {
                try {
                    bw.write(c);
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Something went wrong during cities file filling");
                }
            });
        } catch (IOException e) {
            System.out.println("smth went wrong during cities file creation");
        }


    }
}
