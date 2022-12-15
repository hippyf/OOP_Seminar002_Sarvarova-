package main.java.ru.gb.oopseminar.data;

public class Student extends User {

    private Long studentID;
    private Integer groupID;

    public Student(String firstName, String lastName, String patronymic, Long studentID, Integer groupID) {
        super(firstName, lastName, patronymic);
        this.studentID = studentID;
        this.groupID = groupID;
    }
    public Long getStudentID() {
        return studentID;
    }
    public void setStudentID(Long studentID) {
        this.studentID = studentID;

    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
    
    @Override
    public String toString() {
    return "User{firstName = '" + getFirstName() + '\'' + ", lastName = '" + getLastName() + '\'' + ", patronymic = '" + getPatronymic() + '\'' + ", Group Number = '" + getGroupID() + '\'' + '}';
    }
}
