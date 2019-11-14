package step;

import step.entity.TimeTable;

public class Database {

  public boolean isExisted() {
    return false;
  }

  public void createInitialData() {
    Cities c = new Cities();
    c.create();
    Hours h = new Hours();
    h.create();
    Dates d = new Dates();
    d.create();
    IP i = new IP();
    i.create();
    TimeTable tt = new TimeTable();
    tt.create();
    // create cities
    // create timetable
    // ...

  }
}
