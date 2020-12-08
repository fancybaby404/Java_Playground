package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean perfectNum = isPerfectNumber(10);
        System.out.println(perfectNum);
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;

        if (number < 1){
            return false;
        }

        for(int i = 0; i < number; i++){
            if(number % 2 == 0){
                sum += i;
            }
            if (sum == number){
                System.out.println("Is a Perfect Number");
                return true;
            }
        }
        System.out.println("Not a Perfect Number");
        return false;

    }
}
