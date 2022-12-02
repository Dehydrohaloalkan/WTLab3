package java.by.bsuir.vt3.beans;

import jakarta.xml.bind.annotation.*;

@SuppressWarnings("serial")
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


    public Student(int id, String name, double avgGrade, int group) {
        this.id = id;
        this.name = name;
        this.avgGrade = avgGrade;
        this.group = group;
    }

    public Student() {
        this.id = 0;
        this.name = "no name";
        this.avgGrade = 0.0;
        this.group = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
