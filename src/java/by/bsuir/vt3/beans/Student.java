package java.by.bsuir.vt3.beans;

import jakarta.xml.bind.annotation.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private double avgGrade;
    @XmlElement
    private int group;
}
