//Link : https://leetcode.com/problems/word-search-ii/

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word;
    TrieNode() {
        word = null;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}
class Solution {
    private TrieNode root;
    Solution() {
        root = new TrieNode();
    }
    public List < String > findWords(char[][] board, String[] words) {
        List < String > output = new ArrayList < String > ();
        //insert into trie
        for (String s: words) {
            TrieNode curr = root;
            for (char currChar: s.toCharArray()) {
                int currVal = currChar - 'a';
                if (curr.children[currVal] == null) {
                    curr.children[currVal] = new TrieNode();
                }
                curr = curr.children[currVal];
            }
            curr.word = s;
        }

        TrieNode node = root;
        for (int l = 0; l < board.length; l++) {
            for (int m = 0; m < board[0].length; m++) {
                dfs(l, m, board, output, node);
            }
        }

        return output;
    }
    public void dfs(int r, int c, char[][] board, List < String > res, TrieNode node) {
        char cr = board[r][c];
        if (cr == '#' || node.children[cr - 'a'] == null) {
            return;
        }
        node = node.children[cr - 'a'];
        if (node.word != null) {
            res.add(node.word);
            node.word = null; //for de duplication  ###### used instaed of hashset ######
        }
        board[r][c] = '#';
        int rowLen = board.length;
        int colLen = board[0].length;
        int[][] d  ={{-1,0},{0,-1},{1,0},{0,1}};
        for (int k = 0; k < 4; k++) {
            int currRow = r + d[k][0];
            int currCol = c + d[k][1];
            if (isSafe(currRow, currCol, rowLen, colLen)) {
                dfs(currRow, currCol, board, res, node);
            }
        }
        board[r][c] = cr;
    }

    boolean isSafe(int row, int col, int rowLen, int colLen) {
        if (row >= 0 && col >= 0 && row < rowLen && col < colLen) {
            return true;
        }
        return false;
    }

}
