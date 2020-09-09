package com.tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class User implements Talk{

    private String FirstName;
    private String LastName;

    public User(){
//        System.out.println("Creating a User");
    }

    public User(String fullName){
        setFullName(fullName);
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){ return LastName; }

    public void setFirstName(String s){
        FirstName = s;
    }

    public void setLastName(String s){
        LastName = s.toUpperCase();
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void setFullName(String name) {
//        CAN DO FORMAT CHECKING, RETURN ERRORS IF FOUND
        String[] nameSplit = name.split(" ");
//        System.out.println(Arrays.toString(nameSplit));
        StringBuilder firstName = new StringBuilder();
        for (int i = 0; i < nameSplit.length-1 ; i++) {
            firstName.append(nameSplit[i]);
            firstName.append(' ');
        }
        setFirstName(firstName.toString().strip());
        setLastName(nameSplit[nameSplit.length-1]);
    }

    public static void loadUsersFromFileToList(String pathName, List<User> array) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(pathName));
        while (scanner.hasNext()) {
            User currentUser = new User();
            currentUser.setFullName(scanner.nextLine());
            array.add(currentUser);
        }
    }

    public static void printUsersFromList(List<User> array){
        int i = 1;
        for(User user: array){
            if(user != null) {
                System.out.println("User:" + i + " " + user.getFullName());
                i++;
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getFirstName().equals(user.getFirstName()) &&
                getLastName().equals(user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    public void sayHello() {
        System.out.println("User "+getFullName()+" says Hi!");
    }
}
