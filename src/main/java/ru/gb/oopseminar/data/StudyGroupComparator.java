package main.java.ru.gb.oopseminar.data;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator<Student> {
// HOMEWORK
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getLastName().equalsIgnoreCase(s2.getLastName())) {
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
