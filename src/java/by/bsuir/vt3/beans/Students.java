package java.by.bsuir.vt3.beans;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
    @XmlElements({
            @XmlElement(name="student",type = Student.class),
    })
    private List<Student> students;
}
