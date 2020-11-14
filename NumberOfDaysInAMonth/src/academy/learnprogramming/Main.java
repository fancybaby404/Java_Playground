package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int numberOfDays = getDaysInMonth(2,2000);
        System.out.println(numberOfDays);
    }

    public static boolean isLeapYear(int year){

        //Invalid
        if(year <= 1 || year >= 9999){
            return false;
        }
        //Check If LeapYear
        if(year % 4 == 0 || year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else{
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year){

        //INVALID
        if(month < 1 || month > 12){
            return -1;
        } else if(year < 1 || year > 9999){
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        //CALUCLATION
        if (isLeapYear && month == 1){ //january
            return 31;
        } else if (isLeapYear && month == 2){ //leap year february
            return 29;
        } else if (!isLeapYear && month == 2){ //february
            return 28;
        } else if (isLeapYear && month == 3){ //march
            return 31;
        } else if (isLeapYear && month == 4){ //april
            return 30;
        } else if (isLeapYear && month == 5){ //may
            return 31;
        } else if (isLeapYear && month == 6){ //june
            return 30;
        } else if (isLeapYear && month == 7){ //july
            return 31;
        } else if (isLeapYear && month == 8){ //august
            return 31;
        } else if (isLeapYear && month == 9){ //september
            return 30;
        } else if (isLeapYear && month == 10){ //october
            return 31;
        } else if (isLeapYear && month == 11){ //november
            return 30;
        } else if (isLeapYear && month == 12){ //december
            return 31;
        } else {
            return -1;
        }
    }
}
