package hus.oop.lab9.phonebook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    /* TODO */
    String name;
    String lastName;
    String phone;
    double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(Student s) {
        return (int) (this.average - s.average);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
    }

    @Override
    public boolean equals(Object o) {
        if (!(this.name).equals(((Student) o).getName())) {
            return false;
        }

        if (!(this.lastName).equals(((Student) o).getLastName())) {
            return false;
        }

        if (!(this.phone).equals(((Student) o).getPhone())) {
            return false;
        }

        if (!(this.average != ((Student) o).average)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}