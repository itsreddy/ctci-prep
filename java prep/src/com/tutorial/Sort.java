package com.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static List<Integer> bubbleSortList (List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
