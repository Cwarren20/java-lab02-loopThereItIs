package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int rowSize = 5;
        int columnSize = 5;
        return getMultiplicationTableInRange(rowSize, columnSize);
    }

    public static String getLargeMultiplicationTable() {
        int rowSize = 10;
        int columnSize = 10;
        return getMultiplicationTableInRange(rowSize, columnSize);
    }

    public static String getMultiplicationTable(int tableSize) {
        return getMultiplicationTableInRange(tableSize, tableSize);
    }

    private static String getMultiplicationTableInRange(int rowSize, int columnSize) {
        String table = "";
        for (int row = 1; row <= rowSize; row++) {
            for (int column = 1; column <= columnSize; column++) {
                int result = row * column;
                if (result < 100) {
                    if (result < 10) {
                        table += "  ";
                    } else {
                        table += " ";
                    }
                }
                table += result + " |";
            }
            table += "\n";
        }
        return table;
    }
}
