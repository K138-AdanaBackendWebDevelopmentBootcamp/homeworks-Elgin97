package homework1.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String address;
    private String gender;
    private LocalDate birthDay;

    private List<Courses> courseList=new ArrayList<>();

    public Student() {
    }

    public Student(String name, String address, String gender, LocalDate birthDay) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public List<Courses> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Courses> courseList) {
        this.courseList = courseList;
    }

    //equals ve hashCode için tamamını seçmeliyiz.Çünkü değerlerden hiç biri unique değil.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthDay == student.birthDay && name.equals(student.name) && address.equals(student.address) && gender.equals(student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, gender, birthDay);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
