package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double newArea = area(-1.0,4.0);
        System.out.println(newArea + " area.");


    }

    public static double area(double radius){

        if(radius < 0){
            return -1;
        }

        double pi = Math.PI;

        double calculateArea = radius * radius * pi;

        return calculateArea;
    }
    public static double area(double x, double y){

        double calculateArea = x * y;

        if(y < 0 || x < 0){
            return -1;
        }

        return calculateArea;
    }
}
