package com.tutorial;

public class Teacher extends User {
    public Teacher(){}

    public Teacher(String fullName){
        super(fullName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "FirstName='" + super.getFirstName() + '\'' +
                ", LastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Teacher "+getFullName()+" says Hi!");
    }
}
