package java.by.bsuir.vt3.server.dao.Impl;

import jakarta.xml.bind.JAXBContext;

import java.by.bsuir.vt3.beans.Student;
import java.by.bsuir.vt3.beans.Students;
import java.by.bsuir.vt3.server.dao.StudentDao;
import java.io.FileReader;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students;

    @Override
    public List<Student> getAll() {
        if(students == null) {
            try {
                JAXBContext context = JAXBContext.newInstance(Students.class);
                Students unmarshalledEntity = ((Students) context.createUnmarshaller().
                        unmarshal(new FileReader("./src/resources/students_db.xml")));
                students = unmarshalledEntity.getStudents();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return students;
    }

    @Override
    public Student get(int StudentId) {
        return students.stream().filter(s -> s.getId() == StudentId).findFirst().orElse(null);
    }

    @Override
    public boolean add(Student student) {
        return students.add(student);
    }

    @Override
    public boolean edit(Student editedStudent) {
        Student std = students.stream().filter(s -> s.getId() == editedStudent.getId()).findFirst().orElse(null);
        if (std != null) {
            students.set(editedStudent.getId(), editedStudent);
            return true;
        } else {
            return false;
        }
    }
}
