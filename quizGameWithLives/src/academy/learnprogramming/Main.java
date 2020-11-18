package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lives = 3;
        int clairoAge;

        while (lives > 0){
            System.out.println("What is clairo's age?");
            clairoAge = scan.nextInt();

            if(clairoAge == 22){
                System.out.println("You WON!");
                break;
            } else {
                lives-= 1;
                System.out.println("You have " + lives + " tries remaining U BITCH");
            }
        }
    }
}

//create the program that will ask the user a question, make the user answer that question, check if its correct if not deduct a life
// to the user and ask the question again until their lives runs out or they answer correctly.

// if they answered the question correctly, then tell the user that they WON!
// if they run out of lives then tell the user they LOST!
