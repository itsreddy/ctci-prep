package com.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain {

    public static void runSortMain() {
        int [] array = {5, 2,4, 5, 1,7,3};

        Integer[] integerArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            integerArray[i] = array[i];
        }

        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        List<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(boxedArray));
//        array = Sort.bubbleSort(array);
//        System.out.println(Arrays.toString(array));

//        System.out.println(arraylist.getClass());
//        Arrays.parallelSort(array);
        Integer[] a = new Integer[arraylist.size()];
        System.out.println(Arrays.toString(arraylist.toArray(a)));

        arraylist = Sort.bubbleSortList(arraylist);

        System.out.println(Arrays.toString(arraylist.toArray()));
    }
}
