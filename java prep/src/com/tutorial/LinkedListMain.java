package com.tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LinkedListMain {
    public static void runLinkedListMain(){
        List<Integer> list = new LinkedList<Integer>();
        Integer[] array = {5, 2,4, 5, 1,7,3};

        list.addAll(Arrays.asList(array));
        System.out.println(Arrays.toString(list.toArray(array)));

        List<Integer> sortedList = Sort.bubbleSortList(list);
        System.out.println(Arrays.toString(sortedList.toArray(array)));
    }


    public static void loadUsersFromFileAndPrint() throws FileNotFoundException {

        List<User> array = new LinkedList<User>();
        User.loadUsersFromFileToList("src/names.txt", array);
        User.printUsersFromList(array);
    }

}
