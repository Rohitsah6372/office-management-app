package com.accioJob.officeManagementSystem;

public class manager {
     int managerId;
     String name;
     int age;
     int NumberOfReporters;
     String department;

    public manager(int managerId, String name, int age, int numberOfReporters, String department) {
        this.managerId = managerId;
        this.name = name;
        this.age = age;
        NumberOfReporters = numberOfReporters;
        this.department = department;
    }

    public manager() {
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfReporters() {
        return NumberOfReporters;
    }

    public void setNumberOfReporters(int numberOfReporters) {
        NumberOfReporters = numberOfReporters;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
