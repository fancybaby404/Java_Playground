package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lives = 3;
        int answer = 22;

        while (lives > 0){
            System.out.println("What is clairo's age");
            answer = scan.nextInt();

            if(answer != 22){
                System.out.println("Wrong answer!");
                lives--;
                System.out.println("You've got " + lives + " tries left.");
            } else if (answer == 22){
                System.out.println("YOU WON!!");
                System.exit(0);
                break;
            }

        }
    }
}
//create the program that will ask the user a question, make the user answer that question, check if its correct if not deduct a life
// to the user and ask the question again until their lives runs out or they answer correctly.

// if they answered the question correctly, then tell the user that they WON!
// if they run out of lives then tell the user they LOST!
