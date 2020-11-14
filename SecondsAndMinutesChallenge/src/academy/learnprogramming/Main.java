package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum1 = 200 + 75;
        int sum2 = sum1 + 350;
        int sum3 = sum1 + sum2;
        System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 61)){
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds){
        if(seconds <= 0){
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
