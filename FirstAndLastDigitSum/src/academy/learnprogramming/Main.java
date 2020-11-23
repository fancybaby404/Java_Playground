package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
    }

    public static void sumFirstAndLastDigit (int number){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");

        number = scan.nextInt();
        int firstDigit = 0; // number / 10 until number is greater than 10
        int lastDigit = number % 10; // number % 10


        //FIND FIRST DIGIT
        while (number >= 10){
            firstDigit = number /= 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("First digit is : " + firstDigit);
        System.out.println("Last digit is : " + lastDigit);
        System.out.println("The sum of both first and last digit is : " + sum);

        if(number < 0) {
            System.out.println("Invalid");
        }
    }
}
