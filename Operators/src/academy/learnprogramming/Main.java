package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 3; //1 + 3 = 3
        System.out.println("1 + 3 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        System.out.println("previousResult = " + previousResult);  //previous result is always 3 because it is called very early

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        result++; //1+1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2-1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if(isAlien != true){
            System.out.println("Your not a alien!!");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){      // needs an equal to operator instead of just equal (it gave an error because its an int)
            System.out.println("This is true");
        }

        boolean isCar = false;   // needs an equal to operator instead of just equal (it didn't give an error because its a boolean)
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
