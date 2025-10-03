import java.util.*;
public class Word_Search{
    class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(Search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Search(char[][] board,String word,int i,int j,int idx){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        if(board[i][j] != word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '-';
        boolean found = Search(board, word, i, j - 1, idx + 1) ||
        Search(board, word, i, j + 1, idx + 1) ||
        Search(board, word, i - 1, j, idx + 1) ||
        Search(board, word, i + 1, j, idx + 1);

        board[i][j] = temp;
        return found;
    }
}
}