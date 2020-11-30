package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number){
        //invalid
        if (number < 0){
            return -1;
        }
        //variables
        int sum = 0;
        int lastDigit = 0;
        //calculation
        while(number > 0){
            lastDigit = number % 10;

            if(number % 2 == 0){
                sum += lastDigit;
                number /= 10;
            } else {
                number /= 10;
            }
        }
        //output
        return sum;

    }
}
