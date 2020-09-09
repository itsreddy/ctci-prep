package com.tutorial;

public class Student extends User {

    public Student(){
//        System.out.println("Creating a student");
        super();
    }

    public Student(String fullName){
        super(fullName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + super.getFirstName() + '\'' +
                ", LastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Student "+getFullName()+" says Hi!");
    }
}
