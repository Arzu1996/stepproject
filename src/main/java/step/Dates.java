package step;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dates implements Iterable<String> {
    private final List<String> dates = Arrays.asList
            ("11-14",
                    "11-15",
                    "11-16",
                    "11-17",
                    "11-18",
                    "11-19",
                    "11-14",
                    "11-15",
                    "11-16",
                    "11-17",
                    "11-18",
                    "11-19",
                    "11-14",
                    "11-15",
                    "11-16",
                    "11-17",
                    "11-18",
                    "11-14",
                    "11-15",
                    "11-16",
                    "11-17");

    @Override
    public Iterator<String> iterator() {
        return dates.iterator();
    }

    public void create() {
        try (
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter(new File("src/main/java/step/data/dates.txt")));
        ) {
            dates.forEach(c -> {
                try {
                    bw.write(c);
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Something went wrong during hours file filling");
                }
            });
        } catch (IOException e) {
            System.out.println("Something went wrong during hours file creation");
        }


    }
}

