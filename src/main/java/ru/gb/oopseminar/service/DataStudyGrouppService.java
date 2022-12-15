package main.java.ru.gb.oopseminar.service;

import java.util.List;

import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.Teacher;

public interface DataStudyGrouppService {
    void createStudyGroupp (Teacher teacher, List<Student> students);
    StringBuilder getStudyGroup();
}
