package com.tutorial;

public class LoopMain {
    public static void runLoopMain(){

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10-i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
