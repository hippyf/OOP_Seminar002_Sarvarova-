package main.java.ru.gb.oopseminar;
import java.util.List;
import main.java.ru.gb.oopseminar.controller.Controller;
import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.Teacher;


public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudent("Sergey", "Sidorov", "Sergeevich");
        controller.createStudent("Petr", "Petrov", "Petrovich");
        controller.createStudent("Alex", "Ivanov", "Ivanovich");
        Teacher teacher = new Teacher("Oleg", "Tinkov", "Urievich", 1L);
        List<Student> students = controller.getOnlyStudents();
        System.out.println("СТУДЕНТЫ");
        controller.showAllStudents();
        System.out.println("СТУДЕНЧЕСКАЯ ГРУППА");
        controller.createStudyGroupp(teacher, students);
        System.out.println("СОРТИРОВКА");
        controller.showSortStudyGroup(students);

    }
}
