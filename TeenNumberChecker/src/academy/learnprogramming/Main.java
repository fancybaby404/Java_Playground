package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        hasTeen(20, 56, 46);
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        if(age1 >= 13 && age1 <= 19){
            System.out.println("True");
            return true;
        } else if (age2 >= 13 && age2 <= 19){
            System.out.println("True");
            return true;
        } else if (age3 >= 13 && age2 <= 19){
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
