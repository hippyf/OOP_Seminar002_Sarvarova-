package main.java.ru.gb.oopseminar.view;

import java.util.logging.Logger;
import java.util.List;

import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.StudyGroup;
import main.java.ru.gb.oopseminar.data.User;

public class StudentView {
    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();
        for (User user : users) {
            logger.info(user.toString());
        }
    }
// HOMEWORK
    public void sendOnConsoleStudents(List<Student> students) {
        Logger logger = Logger.getAnonymousLogger();
        for (Student student : students) {
            logger.info(student.toString());
        }
    }
    public void showStudyGroups(List<StudyGroup> studyGroups) {
    Logger log = Logger.getAnonymousLogger();
    for (StudyGroup group : studyGroups) {
        log.info(group.toString());
    }
}

public void sendOnConsoleStudentsSortByID(List<Student> students) {
    Logger logger = Logger.getAnonymousLogger();
    for (Student student : students) {
        logger.info(student.studentAndGroup());
    }
}
}
