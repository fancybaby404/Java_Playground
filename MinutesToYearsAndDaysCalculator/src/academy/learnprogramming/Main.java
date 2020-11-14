package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(5290200);
    }

    public static void printYearsAndDays (long minutes){

        //invalid
        if(minutes < 0){
            System.out.println("Invalid Value");
        }

        //calculate years and days from the minutes parameter

        long years = minutes / 525600;
        long days =  (minutes % 525600) / 1400;


        //print in the format XX min = YY y and ZZ d
        System.out.println(minutes + "min = " + years + "y and " + days + " d");
    }

}
