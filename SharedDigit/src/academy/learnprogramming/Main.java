package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    boolean sharedDigit = hasSharedDigit(15,55);
        System.out.println(sharedDigit);
    }

    //ONLY FIRST AND LAST DIGIT (10 - 99)
    public static boolean hasSharedDigit (int num1, int num2){
        //invalid
        if(num1 < 10 || num1 > 99){
            return false;
        } else if (num2 < 10 || num1 > 99){
            return false;
        }

        //variables
        int firstDigit1 = 0;
        int lastDigit1 = 0;

        int firstDigit2 = 0;
        int lastDigit2 = 0;

        //calculations
        lastDigit1 = num1 % 10;
        while (num1 >= 10){
            firstDigit1 = num1 /= 10;
            break;
        }

        lastDigit2 = num2 % 10;
        while (num2 >= 10){
            firstDigit2 = num2 /= 10;
            break;
        }

        if(firstDigit1 == firstDigit2){
            return true;
        } else if (lastDigit1 == lastDigit2){
            return true;
        } else {
            return false;
        }
    }
}
