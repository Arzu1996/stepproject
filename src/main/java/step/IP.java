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
            ("0001",
                    "0002",
                    "0003",
                    "0004",
                    "0005",
                    "0006",
                    "0007",
                    "0008",
                    "0009",
                    "0010",
                    "0011",
                    "0012",
                    "0013",
                    "0014",
                    "0015",
                    "0016",
                    "0017",
                    "0018",
                    "0019",
                    "0020",
                    "0021");

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
