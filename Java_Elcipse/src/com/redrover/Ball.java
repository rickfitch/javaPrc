package com.redrover;

public class Ball {
    private double ballWeight;

    // static method can't access an instance variable
    double getWeight(){
        return ballWeight;
    }

     void setWeight(double ballWeight){
         this.ballWeight = ballWeight;
    }
}
