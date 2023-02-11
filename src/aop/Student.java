package aop;

public class Student {
    private String nameAndSurname;
    private int course;
    private double averageGrade;

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public Student(String nameAndSurname, int course, double averageGrade) {
        this.nameAndSurname = nameAndSurname;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}
