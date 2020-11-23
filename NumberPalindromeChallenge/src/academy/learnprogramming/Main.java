package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean match = isPalindrome(212);
        System.out.println(match);
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int value = number;

        while(number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= number;
        }
        if(value == reverse){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
