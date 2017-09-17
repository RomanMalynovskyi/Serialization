package com.gmail.malynovskyiroman.javaOOP;

import java.io.*;

/*Используя стандартные методы сериализации создайте мини базу
        данных для работы с группами студентов (возможность записи и чтения
        базы из файла по запросу пользователя).*/

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        Group group2 = new Group(2);

        GroupDB groupDB = new GroupDB();

        Student student1 = new Student("Roman Malynovskyi", "Male", 30, 12345);
        Student student2 = new Student("Natalia Malynovskaya", "Female", 29, 56789);
        Student student3 = new Student("Viktoria Malynovskaya", "Female", 28, 45678);
        Student student4 = new Student("Sergiy Malynovskyi", "Male", 56, 26835);
        Student student5 = new Student("Irina Malynovskaya", "Female", 56, 77235);
        Student student6 = new Student("Maryna Malynovskaya", "Female", 25, 79045);
        Student student7 = new Student("Taras Malynovskyi", "Male", 34, 55883);

        group1.addStudent(student3);
        group1.addStudent(student6);
        group1.addStudent(student2);

        group2.addStudent(student1);
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student7);

        groupDB.addGroup(group1);
        groupDB.addGroup(group2);

        groupDB.printGroupDB();

        writeDBGroupToFile(groupDB, "z:\\Data base of student groups.doc");

        GroupDB groupDBFromFile = readDBGroupFromFile("z:\\Data base of student groups.doc");
        groupDBFromFile.printGroupDB();
    }

    public static void writeDBGroupToFile(GroupDB groupDB, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(groupDB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GroupDB readDBGroupFromFile(String fileName) {
        GroupDB groupDB = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            groupDB = (GroupDB) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return groupDB;
    }
}
