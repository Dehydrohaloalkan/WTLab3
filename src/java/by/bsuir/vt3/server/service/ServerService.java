package java.by.bsuir.vt3.server.service;

import java.by.bsuir.vt3.beans.AccountType;
import java.by.bsuir.vt3.beans.Student;
import java.util.List;

public interface ServerService {
    String login(String username, String password);
    AccountType getAccountType(String authToken);
    void logout(String authToken);
    List<Student> getAll();
    Student get(int id);
    boolean add(Student student);
    boolean edit(Student changedStudent);
}
