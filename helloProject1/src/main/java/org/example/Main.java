package org.example;

import org.example.models.Teacher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Vi du ve viec khoi tao cac thuoc tinh cua 1 doi tuong

        Student student = new Student("BH001");

        System.out.println("ID sv1:"+ student.getId());

        Student student2  = new Student("BH002","Nguyen Van Quang");
        System.out.println("ID sv2:"+ student2.getId());

        Student student3 = new Student("BH003","Le Minh Tuan",90);
        System.out.println("ID sv3:"+ student3.getId());

        // Khi de thuoc tinh public thi se truy cap duoc thuoc tinh
        // o bat ky dau khi khai bao doi tuong
        Teacher teacher = new Teacher();
        System.out.println("Ten giao vien:"+ teacher.name);
        System.out.println("Ten giao vien:"+ teacher.getName());
        // khi de thuoc tinh private thi chi truy cap noi bo Class do va khong
        // goi dc o ben class khac
        // vi du
       // Vi du: System.out.println("Mat khau cua giao vien:"+ teacher.password);

        // Khi de thuoc tinh protected thi trong cung 1 package co the truy cap duoc
        // Neu khac package khong truy cap duoc
        //Vi du: System.out.println("Phone teacher:"+ teacher.phone);
        //Polymorphism
        // Cung 1 animal nhung the hien o nhieu hinh thai khac nhau
        Animal bird = new Bird();
        Animal lion = new Lion();
        bird.attack();
        lion.attack();
        // Trong moi doi tuong thi the hien lai khac nhau tuy cung ten phuong thuc
        // vi du bird - con chim attack theo 1 cach
        // vi du lion - con su tu attack theo 1 cach khac nhau tuy cung ten attack
        // trong moi class thi phuong thuc attack dc override - ghi de theo dac diem
        // tan cong cua tung doi tuong







    }
}