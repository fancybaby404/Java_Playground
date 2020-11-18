package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.println("Add the numbers you want to multiply.");
        System.out.print("First number = ");
        num1 = scan.nextInt();

        System.out.print("Second number = ");
        num2 = scan.nextInt();

        sum = num1 * num2;
        System.out.println("The multiplied number is = " + sum);

    }
}

//create a program that will make the user input the 2 numbers and perform one of the arithmetic operators excluding increment and decrement
