package com.tutorial;

import java.util.Arrays;

public class User {

    private String FirstName;
    private String LastName;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void setFullName(String name) {
        String[] nameSplit = name.split(" ");
//        System.out.println(Arrays.toString(nameSplit));

//        CAN DO FORMAT CHECKING, RETURN ERRORS IF FOUND
        setFirstName(nameSplit[0]);
        setLastName(nameSplit[1]);
    }
    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){ return LastName; }

    public void setFirstName(String s){
        FirstName = s;
    }

    public void setLastName(String s){
        LastName = s;
    }
}
