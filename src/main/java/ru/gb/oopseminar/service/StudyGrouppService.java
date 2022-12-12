package main.java.ru.gb.oopseminar.service;

import java.util.List;
import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.Teacher;

public class StudyGrouppService implements DataStudyGrouppService {
    StringBuilder studyGrouppList = new StringBuilder();

    @Override
    public void createStudyGroupp(Teacher teacher, List<Student> students) {
        this.studyGrouppList.append("Teacher: " + teacher.getTeacherID() + "Students: ");
        for (Student item : students) {
            this.studyGrouppList.append(item.getStudentID());
        }
    }

    @Override
    public StringBuilder getStudyGroup() {
        return this.studyGrouppList;
    }
    
}
