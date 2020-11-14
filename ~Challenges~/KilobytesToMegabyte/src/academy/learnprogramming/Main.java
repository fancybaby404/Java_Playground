package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(15);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        //invalid
        if(kiloBytes <= 0){
            System.out.println("Invalid Number");
        }


        //variables

        int remainder;
        double megaByte;
            
        //calculations

        megaByte = kiloBytes/1000.0;
        remainder = kiloBytes % 4;


        if(kiloBytes > 0){
        System.out.println(kiloBytes + "kb = " + megaByte + "mb and the remaining remainder of " + remainder + "kb" );
        }
    }
}
