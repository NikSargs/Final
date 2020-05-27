import java.util.Comparator;

class CompareByName implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return first.getName().compareTo(second.getName());
    }
}
class CompareByGPA implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return Float.compare(first.getGPA(),second.getGPA());
    }
}

public class Student {
    private String name;
    private float gpa;
    private int birthYear;

    public Student(String name, float gpa, int birthYear) {
        this.name = name;
        this.gpa = gpa;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }
    public float getGPA(){
        return gpa;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public String toString() {
        return String.format("Student(%s, %f, %d)", name, gpa, birthYear);
    }
}
