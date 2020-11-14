package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    System.out.println("Integer BROKEN Value = " + (myMaxIntValue + 1));
    System.out.println("Integer BROKEN Value = " + (myMinIntValue - 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = "+ myMaxByteValue);
        System.out.println("Byte Minimum Value = "+ myMinByteValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Maximum Value = " + myMaxFloatValue);
        System.out.println("Float Minimum Value = " + myMinFloatValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);

        short myShortvalue = 100;
        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long bigLongLiteralValue = 214748364823L;
        System.out.println(bigLongLiteralValue);

        byte byteVariable = 50;
        short shortVariable = 100;
        int intVariable = 150;
        long sum = byteVariable + shortVariable + intVariable;
        long longVariable = 50000 + 10 * sum;

        System.out.println(longVariable);





    }
}
