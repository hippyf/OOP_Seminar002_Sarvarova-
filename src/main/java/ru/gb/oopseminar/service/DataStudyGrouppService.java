package main.java.ru.gb.oopseminar.service;

import java.util.List;
import main.java.ru.gb.oopseminar.data.Teacher;
import main.java.ru.gb.oopseminar.data.User;

public interface DataStudyGrouppService {
    void createStudyGroupp (Teacher teacher, List<User> students);
    StringBuilder getStudyGroup();
}
