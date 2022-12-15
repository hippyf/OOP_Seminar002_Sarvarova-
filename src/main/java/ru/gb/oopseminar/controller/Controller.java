package main.java.ru.gb.oopseminar.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.StudyGroumComparatorByID;
import main.java.ru.gb.oopseminar.data.Teacher;
import main.java.ru.gb.oopseminar.data.User;
import main.java.ru.gb.oopseminar.service.StudyGrouppService;
import main.java.ru.gb.oopseminar.service.UserService;
import main.java.ru.gb.oopseminar.view.StudentView;
import main.java.ru.gb.oopseminar.view.StudyGroupView;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    // public Teacher creatTeacher(String firstName, String lastName, String patronymic, Long teacherID) {
    //     return userService.createUser(firstName, lastName, patronymic, teacherID);
    // }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
   

    public List<Student> getOnlyStudents () {return userService.getAllStudents();}

    public void showTeachersInfo (Teacher teacher) {
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public List<User> createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
        return students;
    }
    public List<Student> createStudent(String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<Student> students = userService.getAllStudents();
        return students;
    }

    private final StudyGrouppService studyGrouppService = new StudyGrouppService();
    private final StudyGroupView studyGroupView = new StudyGroupView();


    public void createStudyGroupp (Teacher teacher, List<Student> studentsList) {
        studyGrouppService.createStudyGroupp(teacher, studentsList);
        StringBuilder studyGroup = new StringBuilder(studyGrouppService.getStudyGroup());
        studyGroupView.SendStudyGrouppOnConcole(studyGroup);
    }
// Homework
    public void showSortStudyGroup(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getLastName().equalsIgnoreCase(s2.getLastName())) {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        studentView.sendOnConsoleStudents(studentList);
    }

    public void showSortStudentsByID(List<Student> studentList) {
        Collections.sort(studentList, new StudyGroumComparatorByID());
        studentView.sendOnConsoleStudentsSortByID(studentList);
    }

}
