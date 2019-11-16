package step.controller;

import step.Console;
import step.SystemConsole;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class BookingController {

  public void add() throws IOException {
    Console console = new SystemConsole();
    console.printLn ("Please insert the flight number: ");
    String fltnumber= console.readLn();

    String line = Files.readAllLines(Paths.get("src/main/java/step/data/timetable.txt")).get(Integer.parseInt(fltnumber)-1);
    System.out.println(line);
    BufferedWriter bw  = Files.newBufferedWriter(Paths.get("src/main/java/step/data/booking.txt"));

    bw.write(line);
       bw.close();
  }

  public void remove() throws IOException {
    Console console = new SystemConsole();
    console.printLn ("Please insert the flight number: ");
    String fltnumber= console.readLn();
    String lines = Files.readAllLines(Paths.get("src/main/java/step/data/booking.txt")).get(Integer.parseInt(fltnumber)-1);
    System.out.println(lines);

    File inputFile = new File("src/main/java/step/data/booking.txt");
    File tempFile = new File("src/main/java/step/data/bookingtemp.txt");

    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

    String currentLine;

    while((currentLine = reader.readLine()) != null) {
      if(null!=currentLine && !currentLine.equalsIgnoreCase(lines)){
        writer.write(currentLine + System.getProperty("line.separator"));
      }
    }
    writer.close();
    reader.close();
    inputFile.delete();
    boolean successful = tempFile.renameTo(inputFile);
    System.out.println(successful);
  }


  public void show() {
    StringBuilder sb = new StringBuilder();

    try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/java/step/data/booking.txt"))) {

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
