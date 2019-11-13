package step;

public class Menu {

  public String show() {
    StringBuilder sb = new StringBuilder();
    sb.append("========================").append('\n');
    sb.append("|    Booking App       |").append('\n');
    sb.append("========================").append('\n');
    sb.append("| 1. Show timetable    |").append('\n');
    sb.append("| 2. Make a booking    |").append('\n');
    sb.append("| 3. Show my bookings  |").append('\n');
    sb.append("| 3. Cancel my booking |").append('\n');
    sb.append("| 4. Exit              |").append('\n');
    sb.append("========================").append('\n');
    return sb.toString();
  }
}
