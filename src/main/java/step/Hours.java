package step;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Hours implements Iterable<String> {
    private final List<String> hours = Arrays.asList
            ("01:00",
                    "02:00",
                    "03:00",
                    "04:00",
                    "05:00",
                    "06:00",
                    "07:00",
                    "08:00",
                    "09:00",
                    "10:00",
                    "11:00",
                    "12:00",
                    "13:00",
                    "14:00",
                    "15:00",
                    "16:00",
                    "17:00",
                    "18:00",
                    "19:00",
                    "20:00",
                    "21:00");

    @Override
    public Iterator<String> iterator() {
        return hours.iterator();
    }

    public void create() {
        try (
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter(new File("src/main/java/step/data/hours.txt")))
        ) {
            hours.forEach(c -> {
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

