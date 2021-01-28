package com.company;

public class Main {

    public static void main(String[] args) {
        boolean testCanPack = canPack(2,2,11);
        System.out.println(testCanPack);
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){

        //big flour bags (5 kilos each)
        //small flour bags (1 kilos each)
        //goal amount of kilos of flour needed to assemble a package
        //bigSmallCountSum must be at least equal to the value of goal.

        int bigSmallCountSum = 0;

        //MAKE bigCount increments of 5
        if (bigCount == 1) {
            bigCount = 5;
        } else if (bigCount == 2) {
            bigCount = 10;
        } else if (bigCount == 3) {
            bigCount = 15;
        } else if (bigCount == 4) {
            bigCount = 20;
        } else if (bigCount == 5) {
            bigCount = 25;
        } else if (bigCount == 6) {
            bigCount = 30;
        }

        bigSmallCountSum = bigCount + smallCount;

        //INVALID
        if(bigCount < 0 || smallCount < 0 || goal < 0 || bigSmallCountSum < 0){
            return false;
        }

        //PRINT
        System.out.println("BigCount = " + bigCount);

        System.out.println("SmallCount " + smallCount);

        System.out.println("Total = " + bigSmallCountSum);

        System.out.println("Goal = " + goal);

        System.out.println("Remainder = " + smallCount % goal);

        //CONDITION
        if(bigSmallCountSum == goal){
            return true;
        } else if(smallCount % goal > 0) {
            return true;
        }

        return false;
    }
}
