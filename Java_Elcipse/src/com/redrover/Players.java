package com.redrover;

import java.util.Iterator;
import java.util.Scanner;
    // default class
 class Players {
    // instance variable
   private int arraySize;

    //CONSTRUCTOR
    // Players constructor is Package private (default accessor)
    Players() {
        System.out.println("How many members in your team?");
        Scanner sc = new Scanner(System.in);
        this.arraySize = sc.nextInt();
        }

         int getArraySize() {
            return arraySize;
        }

         void setArraySize(int arraySize) {
            this.arraySize = arraySize;
        }

        //default method - seen by this package only
     void createArray(){
        Scanner sc = new Scanner(System.in);
        String[] playersName = new String[arraySize];
        System.out.println("enter first players name");

        for (int i = 0; i < arraySize; i++) {
            if (i > 0)System.out.println("enter next player");
            String name = sc.nextLine();
            playersName[i] = name;
        }

        for (String name:playersName){
            System.out.println(name);
        }

    }


}
