package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        int numbersOfColumns = numberOfRows - 1;
        return getTriangleWithinRange(numbersOfColumns);

    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        return getTriangleWithinRange(4);
    }

    public static String getLargeTriangle() {
        return getTriangleWithinRange(9);
    }

    private static String getTriangleWithinRange(int numberOfColumns) {
        String stars = "";
        for (int column = 1; column <= numberOfColumns; column++) {
            for (int j = 0; j < column; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }
}
