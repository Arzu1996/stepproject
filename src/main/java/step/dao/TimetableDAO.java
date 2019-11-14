package step.dao;

import java.util.List;

public interface TimetableDAO<T>{
    TimetableDAO get(int id);
    List<TimetableDAO> getAll();
    void put(TimetableDAO timetableDAO);
    void delete(int id);
}
