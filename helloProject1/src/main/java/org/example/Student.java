package org.example;

import java.util.Date;

public class Student {

    private String id;

    private String name;

    private String email;

    private String phone;

    private Date birthDay;

    private double grade;
    // Khoi tao Doi tuong Student voi 1 tham so ID
    public Student(String id){
        this.id = id;

    }
    // Khoi tao doi tuong Student voi 2 tham so ID, Name
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    // Khoi tao doi tuong Student voi 3 tham so id, name, grade
    public Student(String id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // xay dung get set cho tung thuoc tinh doi tuong
    // get set giong nhu red / write
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDay=" + birthDay +
                ", grade=" + grade +
                '}';
    }
}
