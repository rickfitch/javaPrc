package com.redrover;

public class Main extends Hobbit {

    public static void main(String[] args) {
        int gold = 7;
        float x = 4.1f;
        double y = -9;
        System.out.println(x + y);

        //need to create an instance in order to access Hobbit.countGold() because it is non static
        // not necessary if countGold() made static even though poor practice.

        Main mn = new Main();

        System.out.println("my gold is " + mn.countGold(gold , 6));


      /*  Players team = new Players();

        System.out.printf("your team has %d players \n",team.getArraySize());

        team.createArray();

       */

    }

}
    // use an instance(reference) because main (calling method) is static
    // static methods cannot call non static methods. alt.: make countGold static
     class Hobbit{
      int countGold(int x, int y){
        return (x+y);
    }

        };
