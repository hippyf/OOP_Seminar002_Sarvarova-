package main.java.ru.gb.oopseminar;

import main.java.ru.gb.oopseminar.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name", "LastName", "Patronymic");

    }
}
