package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shell4j
 */
public class RotateMatrix {
    /**
     * 给定一个 n × n 的二维矩阵表示一个图像。

     将图像顺时针旋转 90 度。

     说明：

     你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

     示例 1:

     给定 matrix =
     [
     [1,2,3],
     [4,5,6],
     [7,8,9]
     ],

     原地旋转输入矩阵，使其变为:
     [
     [7,4,1],
     [8,5,2],
     [9,6,3]
     ]
     * @param matrix
     */
    public static void rotate(int[][] matrix) {
        Map<Integer,List<Integer>> columnMap = new HashMap<>(16);
        for(int i=0;i<matrix.length;i++){
            List<Integer> list = new ArrayList<>(16);
            columnMap.put(i,list);
            for(int j=0;j<matrix[i].length;j++){
                columnMap.get(i).add(matrix[i][j]);
            }
        }

        for(int i=0;i<matrix.length;i++){
            int index = matrix.length-1;
            for(int j=0;j<matrix[i].length;j++){
                if(index>=0){
                    matrix[i][j] = columnMap.get(index).get(i);
                    index--;
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = {
                {5, 1, 9,11},
                {2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(j != matrix[i].length-1){
                    System.out.print(matrix[i][j]+"-");
                }else{
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}