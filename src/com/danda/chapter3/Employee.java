package com.danda.chapter3;

public class Employee {

    String name;
    int id;
    String department;
    String position;
    public Employee(String name1, int id1, String department1, String position1)
    {
        name = name1;
        id = id1;
        department = department1;
        position = position1;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return name + ", id #" + id + ", Department: " + department + ", position: " + position;
    }
}
