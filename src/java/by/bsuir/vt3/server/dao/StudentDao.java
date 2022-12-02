package java.by.bsuir.vt3.server.dao;

import java.by.bsuir.vt3.beans.Student;
import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    Student get(int StudentId);
    boolean add(Student student);
    boolean edit(Student editedStudent);
}
