package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       printFactors(-1);
    }

    public static void printFactors(int number){
       //variables
        int factor = 0;

        //logic
        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }

        }
    }
}
