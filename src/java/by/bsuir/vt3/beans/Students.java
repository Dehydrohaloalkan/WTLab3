package java.by.bsuir.vt3.beans;

import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
    @XmlElements({
            @XmlElement(name="student",type = Student.class),
    })
    private List<Student> students;


    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
