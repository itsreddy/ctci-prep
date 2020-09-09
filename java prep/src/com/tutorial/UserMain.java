package com.tutorial;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserMain {

    public static void createUserList(){
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the users:");
//        int n = Integer.parseInt(scanner.nextLine());

        List<User> users = new ArrayList<User>();

        String name;
        int i = 1;
        do {
            User currentUser = new User();
            System.out.print("User " + i + " Enter FirstName and LastName:");
            name = scanner.nextLine();
            if (!name.equals("")) {
                currentUser.setFullName(name);
                users.add(currentUser);
                i++;
            }
        } while (!name.equals(""));
/*
        for (int i = 0; i < n; i++) {
            User currentUser = new User();

            System.out.print("User " + (i+1));
            System.out.println(" Enter FirstName and LastName:");
            String name = scanner.nextLine();

            String[] nameSplit = name.split(" ");
            System.out.println(Arrays.toString(nameSplit));

            currentUser.setFirstName(nameSplit[0]);
            currentUser.setLastName(nameSplit[1]);
            users[i] = currentUser;
        }
*/

        System.out.println("Current names are");
        if(users.size() == 0) System.out.println("No current users present");
        else {
            i = 1;
            for(User user: users){
                if(user != null) {
                    System.out.println("User:" + i + " " + user.getFullName());
                    i++;
                }
            }
        }

    }

    public static void setAndGetName() {

        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter First Name:");
        user.setFirstName(scanner.nextLine());

        System.out.println("Enter Last Name:");
        user.setLastName(scanner.nextLine());

        System.out.println(user.getFullName());

        scanner.close();
    }

    public static void runToString(){}

    public static void testPolymorphism(){
        Student user1 = new Student("Prash Reddy Duggirala");
        User user2 = new User("Prash Reddy");

        User[] userArray = {user1, user2};

        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }

    }

    public static void testHello() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/names.txt"));
        List<String> names = new ArrayList<String>();
        while (scan.hasNext()){
            names.add(scan.nextLine());
        }
        List<User> userArray = new ArrayList<User>();
        userArray.add(new User(names.get(0)));
        userArray.add(new Student(names.get(1)));
        userArray.add(new Teacher(names.get(2)));

        for (int i = 0; i < userArray.size(); i++) {
//            System.out.println(userArray.get(i));
            userArray.get(i).sayHello();
        }

    }

}
