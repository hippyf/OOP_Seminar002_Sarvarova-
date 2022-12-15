package main.java.ru.gb.oopseminar.data;

public abstract class User {

    private String firstName;
    private String lastName;
    private String patronymic;
    public Integer getStudentID;
    
    public User(String firstName, String lastName, String patronymic) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getStudentID() {
        return null;
    }

    

    @Override
    public String toString() {
        return "User{firstName = '" + firstName + '\'' + ", lastName = '" + lastName + '\'' + ", patronymic = '" + patronymic + '\'' + '}'; 
    }
}
