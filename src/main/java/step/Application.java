package step;

import java.io.IOException;

public class Application {
  public static void main(String[] args) throws IOException {
    Console console = new SystemConsole();
    Database database = new Database();
    Core app = new Core(console, database);
    app.run();
  }
}
