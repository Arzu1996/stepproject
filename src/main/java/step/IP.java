package step;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IP implements Iterable<String> {
    private final List<String> IP = Arrays.asList
            ("1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21");

    @Override
    public Iterator<String> iterator() {
        return IP.iterator();
    }

    public void create() {
        try (
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter(new File("src/main/java/step/data/IP.txt")))
        ) {
            IP.forEach(c -> {
                try {
                    bw.write(c);
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println("Something went wrong during IP file filling");
                }
            });
        } catch (IOException e) {
            System.out.println("Something went wrong during IP file creation");
        }


    }
}
