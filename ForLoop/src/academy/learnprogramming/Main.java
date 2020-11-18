package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double calculateInterest = calculatorInterest(10000,2);

        //2 to 8 interest rate
        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f",calculatorInterest(10000.0, i)));
        }

        System.out.println(" ");

        // 8 to 2 interest rate
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculatorInterest(10000.0, i)));
        }

        for (int i = 0; i < 50; i++){
            if(!isPrime(i)){
                System.out.println(i);
            } else if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }

    }

    public static boolean isPrime(int n){
        if(n == 1 || n == 0){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculatorInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
