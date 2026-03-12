// Student POJO Class
public class pojo {
    class Student{
    private int studentId;
    private String name;
    private double cgpa;
    private String branch;

    // No-argument constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int studentId, String name, double cgpa, String branch) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
        this.branch = branch;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getBranch() {
        return branch;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", branch='" + branch + '\'' +
                '}';
    }
}
}