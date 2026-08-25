import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];
                if (ch == '.') continue;

                String row = ch + " in row " + i;
                String col = ch + " in col " + j;
                String box = ch + " in box " + (i/3) + "-" + (j/3);

                if (!seen.add(row) || !seen.add(col) || !seen.add(box))
                    return false;
            }
        }
        return true;
    }
}
