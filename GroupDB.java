package com.gmail.malynovskyiroman.javaOOP;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupDB implements Serializable {
    private ArrayList<Group> listGroups;

    public GroupDB() {
        this.listGroups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        if (listGroups.contains(group)) {
            System.out.println("Data base already contains " + group.toString());
            return;
        } else {
            listGroups.add(group);
        }
    }

    public void removeGroup(Group group) {
        if (listGroups.contains(group)) {
            listGroups.remove(group);
        } else {
            System.out.println("Group №" + group.getNumber() + " not founded!");
            return;
        }
    }

    public void printGroupDB() {
        System.out.println("*******Data base of student groups*******");
        for (Group group : listGroups) {
            System.out.println("Group №" + group.getNumber());
            group.printGroup();
        }
    }
}
