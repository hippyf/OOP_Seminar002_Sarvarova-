package main.java.ru.gb.oopseminar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.ru.gb.oopseminar.data.Student;
import main.java.ru.gb.oopseminar.data.User;

public class UserService implements DataService {
    
    private final List<User> users;
    private List<Student> students;

    public UserService() {
        this.users = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Random randomID = new Random();
        Integer groupID;
        Long id = 0L;
        for ( User item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student)(item)).getStudentID()) {
                    id = ((Student)(item)).getStudentID();
                }
            }
        } 
        groupID = randomID.nextInt(1,4);
        this.users.add(new Student(firstName, lastName, patronymic,++id, groupID));
        this.students.add(new Student(firstName, lastName, patronymic,id, groupID));
    }

    public List<Student> getAllStudents () {
        return this.students;
    }

    @Override
    public List<User> getAll() {

        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for ( User item : this.users) {
            if(item instanceof Student) {
                if (id.equals(((Student)(item)).getStudentID())) {
                    this.users.remove(item);
                }
            }
        }
        
    }   
}
