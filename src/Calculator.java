
import java.util.Scanner;

/**
 * A simple calculator with some functions.
 * By Kamil Biernacki
 */
public class Calculator {

///////////////////////////////   FUNCTIONS  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    /**
     * Function which add doubles
     *
     * @param a = choosen numbers
     */
    public static void addNumbers(double... a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        System.out.println(result);
    }

    /**
     * Function which substract doubles
     *
     * @param a = choosen numbers
     */
    public static void substractNumbers(double... a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result -= a[i];
        }
        System.out.println(result);
    }

    /**
     * Function which multiply doubles
     *
     * @param a = choosen numbers
     */
    public static void multiplyNumbers(double... a) {
        double result = 1;
        for (int i = 0; i < a.length; i++) {
            result *= a[i];
        }
        System.out.println(result);
    }

    /**
     * Function which divide two doubles
     *
     * @param a = first number
     * @param b = second number
     */
    public static void divideNumbers(double a, double b) {
        if (b != 0)
            System.out.println((double) a / b);
        else
            System.out.println("You cannot divide by ZERO!");
    }

    /**
     * sqrt number
     * @param number
     * @param rank
     */
    public static void sqrt(double number, double rank) {

        double result = number;
        double tmp = Math.pow(result, (rank - 1));
        double e = 0.00000001;

        while (Math.abs(number - tmp * result) >= e) {
            result = (1 / rank) * ((rank - 1) * result + (number / tmp));
            tmp = Math.pow(result, rank - 1);
        }
        if (number < 0 && rank % 2 != 0)
            System.out.println(0 - result);
        else
            System.out.printf("%8.3f",result);
    }

    /**
     * Power a number
     * @param number
     * @param pow
     */
    public static void power(double number, int pow) {
        double result = 1;

        if (pow == 0)
            System.out.println(1.0);
        else if (pow == 1)
            System.out.println(number);

        else {
            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }
            System.out.println(result);
        }
    }

    public static void power(double number, double pow) {
        System.out.println(Math.pow(number, pow));
    }

    /**
     * convert number to decimal system
     * @param number
     * @param base
     */
    public static void convertToBinary(int number, int base) {
        final int MAXIMUM_BASE = 36;
        final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = " ";

        if (base > MAXIMUM_BASE || base < 2)
            System.out.println("Wrong data");
        else if (number == 0)
            System.out.println(0);
        else {
            do {
                result = patternText.charAt(number % base) + result;
                number = number / base;
            } while (number > 0);

            System.out.println(result);
        }
    }

    /**
     * Method for convertDecimalToNumber() method
     *
     * @param x
     * @param base
     * @return
     */
    private static int valueOf(char x, int base) {
        final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < base; i++) {
            if (x == patternText.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * convert binary system to decimal
     * @param str
     * @param base
     */
    public static void convertBinaryToDecimal(String str, int base) {
        final int MAXIMUM_BASE = 36;
        final String patternText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int value;
        int rank = 1;
        int result = 0;
        str = str.toUpperCase();

        if (base > MAXIMUM_BASE || base < 2)
            System.out.println(0);

        for (int i = str.length() - 1; i >= 0; i--) {
            value = valueOf(str.charAt(i), base);
            if (value < 0) {
                System.out.println(0);
            } else {
                result = result + (value * rank);
                rank = rank * base;
            }
        }
        System.out.println(result);
    }

    /**
     * calculate a median number
     * @param a
     */
    public static void median(double... a)
    {
        double value;
        if(a.length % 2 == 0)
        {
            System.out.println(a[a.length / 2-1] + " , "+ a[a.length / 2]);
        }
        else {
            value = a[a.length / 2];
            System.out.println(value);
        }
    }

    /**
     * calculate average of numbers
     * @param a
     */
    public static void calculateAverage(double...a)
    {
        double result = 0;
        double average = 0;

        for (int i = 0; i < a.length; i++)
        {
            result = result + a[i];
            average = result/a.length;
        }
        System.out.println(average);
    }

}

