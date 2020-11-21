package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10,10,10,10,10};
        int sum = 0;
        for(int i:numbers){
            sum = sum + i;
        }
        System.out.println("The sum of all the numbers inside the array is " + sum);
    }
}
