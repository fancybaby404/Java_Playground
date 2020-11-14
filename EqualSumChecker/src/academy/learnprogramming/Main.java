package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    hasEqualSum(1,-1,0);
    }

    public static boolean hasEqualSum(int number1, int number2, int number3){

        int sum = number1 + number2;

        if(sum == number3){
            System.out.println("True");
            return true;
        } else{
            System.out.println("False");
            return false;
        }
    }
}
