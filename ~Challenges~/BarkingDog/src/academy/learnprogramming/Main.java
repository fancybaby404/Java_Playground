package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true , 1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking && hourOfDay < 8 || hourOfDay > 22){
            System.out.println("true");
            return true;
        } else if (!barking && hourOfDay < 0 || hourOfDay > 23){
            System.out.println("false");
            return false;
        } else{
            System.out.println("false");
            return false;
        }
    }
}
