package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                totalEvenNumbers++;
                continue;
            }

            if (totalEvenNumbers == 5){
                break;
            }
        }
        System.out.println("The total even numbers are found is " + totalEvenNumbers);
    }
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            System.out.println(num + " is a even number");
            return true;
        } else{
            return false;
        }

    }
}
