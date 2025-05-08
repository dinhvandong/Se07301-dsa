package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args)
    {

        int arrayNum [] = new int[10]; // cach 1
        int array []  = {1,2,3,4,5,6,7,8,9,0}; // cach 2

        // Co 2 cach khai bao mang
        // 1 khoi tao 1 mang voi kich thuoc cho truoc
        // 2 khoi tao 1 mang voi cac phan tu co dinh
        // Lay ve kich thuoc cua mang array
        System.out.println("array1:" + arrayNum.length);
        System.out.println("array2"+ array.length);

        List<Student> listStudent = new ArrayList<Student>();
        Student student1 = new Student("BH001","Nguyen van A");
        Student student2 = new Student("BH002","Nguyen van B");
        Student student3 = new Student("BH003","Nguyen van C");
        Student student4 = new Student("BH004","Nguyen van D");

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        for(Student student: listStudent){
            System.out.println(student.toString());
        }










    }
}
