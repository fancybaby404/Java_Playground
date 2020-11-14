package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        isCatPlaying(true,45);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(!summer && temperature >= 25 && temperature <= 35){
            System.out.println("true");
            return true;
        } else if(summer && temperature >= 25 && temperature <= 45){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
