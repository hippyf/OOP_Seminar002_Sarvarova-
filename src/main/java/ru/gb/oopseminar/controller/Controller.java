package main.java.ru.gb.oopseminar.controller;

import java.util.List;
import main.java.ru.gb.oopseminar.data.Teacher;
import main.java.ru.gb.oopseminar.data.User;
import main.java.ru.gb.oopseminar.service.StudyGrouppService;
import main.java.ru.gb.oopseminar.service.UserService;
import main.java.ru.gb.oopseminar.view.StudentView;
import main.java.ru.gb.oopseminar.view.StudyGroupView;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public List<User> createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
        return students;
    }

    private final StudyGrouppService studyGrouppService = new StudyGrouppService();
    private final StudyGroupView studyGroupView = new StudyGroupView();


    public void createStudyGroupp (Teacher teacher, List<User> students) {
        studyGrouppService.createStudyGroupp(teacher, students);
        StringBuilder studyGroup = new StringBuilder(studyGrouppService.getStudyGroup());
        studyGroupView.SendStudyGrouppOnConcole(studyGroup);
    }


}
