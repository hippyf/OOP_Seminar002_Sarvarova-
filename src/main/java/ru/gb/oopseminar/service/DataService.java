package main.java.ru.gb.oopseminar.service;

import java.util.List;

import main.java.ru.gb.oopseminar.data.User;

public interface DataService {  
    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(Long id);
}
