import java.util.ArrayList;
import java.util.List;

/**
 * A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
 * <col> denotes the column number c of the cell. It is represented by alphabetical letters.
 * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
 * <row> is the row number r of the cell. The rth row is represented by the integer r.
 * You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1>
 * represents the row r1, <col2> represents the column c2, and <row2> represents the row r2,
 * such that r1 <= r2 and c1 <= c2.
 * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.
 */
public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        String s = "K1:L2";
        CellsInARangeOnAnExcelSheet cells = new CellsInARangeOnAnExcelSheet();
        System.out.println(cells.cellsInRange(s));
    }

    public List<String> cellsInRange(String s) {
        List<String> strings = new ArrayList<>();
        char startLet = s.charAt(0);
        char endLet = s.charAt(3);
        byte startInt = (byte) ((s.charAt(1)) - 48);
        byte endInt = (byte) ((s.charAt(4)) - 48);
        for (char i = startLet; i < endLet + 1; i++) {
            for (byte j = startInt; j < endInt + 1; j++) {
                strings.add(i + "" + j);
            }
        }
        return strings;
    }
}