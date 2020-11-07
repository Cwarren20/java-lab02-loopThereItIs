package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNumbers += i;
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNumbers += i;
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop; i += step) {
            squareNumbers += i * i;
        }
        return squareNumbers;
    }

    // Parameter says start but it passes test if I treat it as a stop.
    public static String getRange(int start) {
        String numbers = "";
        for (int i = 0; i < start; i++) {
            numbers += i;
        }
        return numbers;
    }

    public static String getRange(int start, int stop) {
        String numbers = "";
        for (int i = start; i < stop; i++) {
            numbers += i;
        }
        return numbers;
    }


    public static String getRange(int start, int stop, int step) {
        String numbers = "";
        for (int i = start; i < stop; i += step) {
            numbers += i;
        }
        return numbers;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponents = "";
        for (int i = start; i < stop; i += step) {
            // Math.pow() is the same as writing i^exponent.
            // Casting to (int) rounds it. (Rounds down I believe.)
            int result = (int) Math.pow(i, exponent);
            exponents += result;
        }
        return exponents;
    }
}
