package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	printEqual(4,54,54);
    }

    public static void printEqual (int num1, int num2, int num3){

        //Invalid Value
        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
            //All values are equal
        } else if(num1 == num2 && num2 == num3 && num3 == num1){
            System.out.println("All numbers are equal");
            // All values are different from each other
        } else if (num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("All numbers are different");
            // Neither all are equal or different
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
