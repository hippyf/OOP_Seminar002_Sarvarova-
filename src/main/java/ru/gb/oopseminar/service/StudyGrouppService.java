package main.java.ru.gb.oopseminar.service;

import java.util.List;
import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.Teacher;
import main.java.ru.gb.oopseminar.data.User;

public class StudyGrouppService implements DataStudyGrouppService {
    StringBuilder studyGrouppList = new StringBuilder();

    @Override
    public void createStudyGroupp(Teacher teacher, List<User> students) {
        this.studyGrouppList.append("Teacher: " + teacher.getTeacherID() + "Students: ");
        for (User item : students) {
            this.studyGrouppList.append(((Student)(item)).getStudentID());
        }
    }

    @Override
    public StringBuilder getStudyGroup() {
        return this.studyGrouppList;
    }
    
}
