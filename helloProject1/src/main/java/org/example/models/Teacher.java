package org.example.models;

public class Teacher {

    public String name;

    private String password;


    protected  String phone;


    public String getName(){
        return name;
    }

    public void printInfo(){

        System.out.println("Mat khau teacher:"+password);
    }
}
