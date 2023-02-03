/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 */

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        System.out.println(zigzagConversion.convert(s, numRows));
        System.out.println(zigzagConversion.convert2(s, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows==1) {
            return s;
        }
        int numCols = (s.length() / 2) + 1;
        char[][] mtx = new char[numRows][numCols];
        int cRow = 0;
        int cCol = 0;
        int pointer = 0;
        for (int i = 0; i < s.length(); i += (numRows - 1) * 2) {
            while (pointer < s.length() && cRow < numRows) {
                mtx[cRow++][cCol] = s.charAt(pointer++);
            }
            cRow -= 2;
            cCol++;
            while (pointer < s.length() && cRow > 0) {
                mtx[cRow--][cCol++] = s.charAt(pointer++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char[] chars : mtx) {
            for (char aChar : chars) {
                if (aChar!='\0') {
                    sb.append(aChar);
                }
            }
        }
        return sb.toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows==1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += step) {
                sb.append(s.charAt(j));
                if (i!=0 && i!=numRows - 1 && j + step - 2 * i < s.length()) {
                    sb.append(s.charAt(j + step - 2 * i));
                }
            }
        }
        return sb.toString();
    }
}
