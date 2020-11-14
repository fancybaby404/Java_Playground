package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum1 = 200 + 75;
        int sum2 = sum1 + 350;
        int sum3 = sum1 + sum2;

        System.out.println(sum3);
        calcFeetInchesToCentimeters(69,5);
    }

    public static double calcFeetInchesToCentimeters(double feet, double inches){

        if(feet <= 0 || inches <= 0 || inches >= 12){
            System.out.println("Invalid inches or feet parameter.");
            return -1;
        }

        double convertToCentimeters;

        convertToCentimeters = (feet * 30.48 + inches * 2.54);

        System.out.println(feet + "feet , " + inches + "inches = " + convertToCentimeters);

        return convertToCentimeters;

    }

    public static double calcFeetInchesToCentimeters(double inches){

        if(inches < 0) {
            System.out.println("Invalid inches parameter.");
            return -1;
        }

            double convertToFeet;

            convertToFeet = inches / 12;

            System.out.println(inches + " inches = " + convertToFeet + " feet");

            return convertToFeet;
    }
}

