package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author shell4j
 */
public class IsValidSudoku {
    /**
     * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

     数字 1-9 在每一行只能出现一次。
     数字 1-9 在每一列只能出现一次。
     数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。


     上图是一个部分填充的有效的数独。

     数独部分空格内已填入了数字，空白格用 '.' 表示。

     示例 1:

     输入:
     [
     ["5","3",".",".","7",".",".",".","."],
     ["6",".",".","1","9","5",".",".","."],
     [".","9","8",".",".",".",".","6","."],
     ["8",".",".",".","6",".",".",".","3"],
     ["4",".",".","8",".","3",".",".","1"],
     ["7",".",".",".","2",".",".",".","6"],
     [".","6",".",".",".",".","2","8","."],
     [".",".",".","4","1","9",".",".","5"],
     [".",".",".",".","8",".",".","7","9"]
     ]
     输出: true
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        boolean result = true;

        Map<Integer,Set<Character>> columnMap = new HashMap<>(16);
        for(int i=0;i<board.length;i++){
            Set<Character> set = new HashSet<>(16);
            columnMap.put(i,set);
        }

        Map<String,Set<Character>> cellMap = new HashMap<>(16);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Set<Character> set = new HashSet<>(16);
                cellMap.put(String.valueOf(i)+String.valueOf(j),set);
            }
        }

        for(int i=0;i<board.length;i++){
            Set<Character> charSet = new HashSet<>(16);
            for(int j=0;j<board[i].length;j++){
                //对每行数据在1-9中是否重复进行判断
                if(board[i][j] != '.' && !charSet.add(board[i][j])){
                    result = false;
                    return result;
                }

                //对每列数据在1-9中是否重复进行判断
                if(board[i][j] != '.' && !columnMap.get(j).add(board[i][j])){
                    result = false;
                    return result;
                }

                //对数字1-9在每一个以粗实线分隔的 3x3 宫内只能出现一次进行判断
                String key = String.valueOf(i/3)+String.valueOf(j/3);
                if(board[i][j] != '.' && !cellMap.get(key).add(board[i][j])){
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        char[][]  board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        boolean result = isValidSudoku(board);
        System.out.print(result);
    }
}
