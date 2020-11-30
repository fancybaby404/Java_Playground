package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int greatestCommonDivisor = getGreatestCommonDivisor(10,35);
        System.out.println(greatestCommonDivisor);
    }

    public static int getGreatestCommonDivisor (int num1, int num2){
        //invalid
        if(num1 < 10 || num2 < 10){
            return -1;
        }

        //variables
        int gcd1 = 0;


        for(int i = 1; i <= num1 && i <= num2; i++){

            if ((num1 % i == 0) && (num2 % i == 0)){

                gcd1 = i;
            }

        }
        return  gcd1;
        /*return greatest common divisor of both int
        greatest common divisor is the largest positive integer that can fully divide
        each of the integers (i.e. without leaving a remainder).

        use a while OR A for loop and check if both numbers can be divided without a remainder.
        find the minimum of the two numbers
        */
    }
}
