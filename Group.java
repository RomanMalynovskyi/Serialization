package com.gmail.malynovskyiroman.javaOOP;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
    private ArrayList<Student> listStudents;
    private int number;

    public Group(int number) {
        this.listStudents = new ArrayList<>();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addStudent(Student student) {
        if (listStudents.contains(student)) {
            System.out.println("Group " + this.number + " already contains " + student.toString());
            return;
        } else {
            student.setGroupNumber(number);
            listStudents.add(student);
        }

    }

    public void removeStudent(Student student) {
        if(listStudents.contains(student)){
            listStudents.remove(student);
        }else{
            System.out.println("Student not not founded!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (number != group.number) return false;
        return listStudents.equals(group.listStudents);
    }

    @Override
    public int hashCode() {
        int result = listStudents.hashCode();
        result = 31 * result + number;
        return result;
    }

    public void printGroup() {
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Group № " + number;
    }
}
