package homework1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Instructor {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Courses> courseList=new ArrayList<>();

    public Instructor() {
    }

    public Instructor(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Courses> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Courses> courseList) {
        this.courseList = courseList;
    }
 //phoneNumber unique değer olduğu için equals fonksiyonuna onu yazdık.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
