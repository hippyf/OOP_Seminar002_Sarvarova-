package main.java.ru.gb.oopseminar;

import java.util.List;

import main.java.ru.gb.oopseminar.controller.Controller;
import main.java.ru.gb.oopseminar.data.Teacher;
import main.java.ru.gb.oopseminar.data.User;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        List<User>students = controller.createUser("Name", "LastName", "Patronymic");


        Controller controller2 = new Controller();
        Teacher teacher = new Teacher("Oleg", "Tinkov", "Urievich", 1L);
        controller2.createStudyGroupp(teacher, students);


    }
}
