import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public String toCSV() {
        return name + "," + age + "," + grade;
    }
}
