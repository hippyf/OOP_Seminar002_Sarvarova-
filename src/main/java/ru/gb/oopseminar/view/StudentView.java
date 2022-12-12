package main.java.ru.gb.oopseminar.view;

import java.util.logging.Logger;
import java.util.List;

import main.java.ru.gb.oopseminar.data.User;

public class StudentView {
    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();
        for (User user : users) {
            logger.info(user.toString());
        }
    }
}
