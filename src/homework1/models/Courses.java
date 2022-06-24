package homework1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Courses {
    private  String courseName;
    private String courseCode;
    private int creditPuan;

    private List<Student> studentListList=new ArrayList<>();
    private Instructor instructor;

    public Courses() {
    }

    public Courses(String courseName, String courseCode, int creditPuan) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditPuan = creditPuan;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditPuan() {
        return creditPuan;
    }

    public void setCreditPuan(int creditPuan) {
        this.creditPuan = creditPuan;
    }

    public List<Student> getStudentListList() {
        return studentListList;
    }

    public void setStudentListList(List<Student> studentListList) {
        this.studentListList = studentListList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
//course code unique bir değerdir.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return creditPuan == courses.creditPuan && courseName.equals(courses.courseName) && courseCode.equals(courses.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, creditPuan);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", creditPuan=" + creditPuan +
                '}';
    }
}
