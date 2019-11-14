package step.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TimetableController {
  public void show() {
    StringBuilder sb = new StringBuilder();

    try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/java/step/data/timetable.txt"))) {

      // read line by line
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line).append("\n");
        System.out.println(line);
      }

    } catch (IOException e) {
      System.err.format("IOException: %s%n", e);
    }
  }
}
