package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

    isEvenNumber(5);

        int count = 1;
        int endNumber = 20;

        while(count <= endNumber){
            count++;
            if (!isEvenNumber(count)){
                continue;
            }
            System.out.println(count + " is an even number");
        }

//// WHILE
//        int count = 1;
//        while(count < 6){
//            System.out.println("Count value is = " + count);
//            count++;
//        }
////  DO WHILE
//        count = 6;
//        do{
//            System.out.println("Count value is = " + count);
//            count++;

//            if (count > 5){
//                break;
//            }
//        } while (count != 6);
    }

    public static boolean isEvenNumber(int num){
            if (num % 2 ==0){
                return true;
            } else {
                return false;
            }

    }
}
