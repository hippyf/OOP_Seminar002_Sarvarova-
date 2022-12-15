package main.java.ru.gb.oopseminar.data;

import java.util.Comparator;

public class StudyGroumComparatorByID implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStudentID().compareTo(s2.getStudentID());
    }
    
}
