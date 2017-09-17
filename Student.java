package com.gmail.malynovskyiroman.javaOOP;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String sex;
    private int age;
    private int bookIDNumber;
    private int groupNumber;

    public Student(String name, String sex, int age, int bookIDNumber, int groupNumber) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.bookIDNumber = bookIDNumber;
        this.groupNumber = groupNumber;
    }

    public Student(String name, String sex, int age, int bookIDNumber) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.bookIDNumber = bookIDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBookIDNumber() {
        return bookIDNumber;
    }

    public void setBookIDNumber(int bookIDNumber) {
        this.bookIDNumber = bookIDNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (bookIDNumber != student.bookIDNumber) return false;
        if (groupNumber != student.groupNumber) return false;
        if (!name.equals(student.name)) return false;
        return sex.equals(student.sex);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + age;
        result = 31 * result + bookIDNumber;
        result = 31 * result + groupNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", bookIDNumber=" + bookIDNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
