package com.accioJob.officeManagementSystem;

public class employee {

    private int emp_id;
    private String name;
    private int age;
    private String department;
    private int sal;
    private String gender;

    public employee(int emp_id, String name, int age, String department, int sal, String gender) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.sal = sal;
        this.gender = gender;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
