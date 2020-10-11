// Link : https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        return horizontal(board) && vertical(board) && checkEachCell(board);
    }
    public boolean horizontal(char[][] board) {
        HashSet < Character > seth = new HashSet < > ();
        for (int i = 0; i < 9; i++) {
            seth = new HashSet < > ();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seth.add(c)) {
                        return false;
                    }

                }
            }
        }
        return true;
    }

    public boolean vertical(char[][] board) {
        HashSet < Character > setv = new HashSet < > ();
        for (int i = 0; i < 9; i++) {
            setv = new HashSet < > ();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (!setv.add(c)) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
    public boolean checkEachCell(char[][] board) {
        HashSet < Character > set = new HashSet < > ();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                set = new HashSet < > ();
                for (int k = i; k < 3 + i; k++) {
                    for (int l = j; l < 3 + j; l++) {
                        char c = board[k][l];
                        if (c != '.') {
                            if (!set.add(c)) {
                                return false;
                            }

                        }
                    }
                }

                j += 2;
            }
            i += 2;
        }

        return true;
    }
}
