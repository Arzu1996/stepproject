package step.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TimeTable {
  private final List<TimetableLine> data = new ArrayList<>();

  public TimeTable() {
    if (isExisted()) {
      load();
    } else {
      create();
    }
  }

  public boolean isExisted() {

    File file = new File("src/main/java/step/data/timetable.txt");
    return file.exists();

  }

  public void load() {
    // load the timetable from file
  }

  public void create() {
    // read the cities from file
    StringBuilder sb = new StringBuilder();

    try (
            BufferedReader bri = Files.newBufferedReader(Paths.get("src/main/java/step/data/IP.txt"));
            BufferedReader brc = Files.newBufferedReader(Paths.get("src/main/java/step/data/cities.txt"));
            BufferedReader brh = Files.newBufferedReader(Paths.get("src/main/java/step/data/hours.txt"));
            BufferedReader brd = Files.newBufferedReader(Paths.get("src/main/java/step/data/dates.txt"));
            BufferedWriter bw  = Files.newBufferedWriter(Paths.get("src/main/java/step/data/timetable.txt"))
    ) {

      String line;
      while ((line = bri.readLine()) != null) {
        bw.write(line+ " " + brc.readLine() + " " + brd.readLine() + " " + brh.readLine() );
        bw.newLine();
      }

    } catch (IOException e) {
      System.err.format("IOException: %s%n", e);
    }
    // create the timetable

    // write the timetable to file
  }
}
