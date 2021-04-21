package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	printSquareStar(5);
    }

    public static void printSquareStar(int number){
        //INVALID
        if(number < 5){
            System.out.println("Invalid Value");
        } else {

            //print the pattern
            for(int i = 0; i <= number; i++){
                for (int a = 5; a <= number; a++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
