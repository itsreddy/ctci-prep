package com.tutorial;
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
}
