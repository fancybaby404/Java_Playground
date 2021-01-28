package com.company;

public class Main {

    public static void main(String[] args) {

        String year = "2020";
        System.out.println("Last year was " + year);

        int yearNumber = Integer.parseInt(year);
        System.out.println("Last year was " + yearNumber);

        yearNumber += 1;
        System.out.println("Last year was " + year + " but now it's " + yearNumber);

        yearNumber -= 5;
        System.out.println("Last year minus 5 is " + yearNumber);

    }


    //nothing just reminding myself of the things i learned
    public static void hamburger(){

        boolean isTrue = true;
        int lessZero = 5;

        //forloop
        for(int i = 0; i < 10; i++){
            System.out.println("hello");

        }

        //dowhile
        do{
            System.out.println("burger");
            lessZero--;
        }while (isTrue && lessZero > 0);


        //foreach
        String[] hamburgers = {"bigmac", "zombieburger", "largecokeburger", "doublecheesewopper"};

        for(String hamburger: hamburgers){
            System.out.println(hamburger);
        }

        //if
        int number = 5;

        if(number < 5){
            System.out.println("lessthan 5");
        } else if (number > 5){
            System.out.println("greaterthan 5");
        } else {
            System.out.println("neitherlessorgreaterthan 5");
        }

        //switch
        String numb = "1";
        switch (numb = "number1"){
            case "1" :
                System.out.println("1");
            case "2":
                System.out.println("2");
            case "3":
                System.out.println("3");
        }

        //primitive data types
        int Int;
        double Double;
        float Float;
        byte Byte;
        long Long;
        boolean Boolean;
        short Short;
        char Char = 'C';
        String string;


    }
}
