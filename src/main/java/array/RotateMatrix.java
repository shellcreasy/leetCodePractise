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
     * <p>
     * 将图像顺时针旋转 90 度。
     * <p>
     * 说明：
     * <p>
     * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
     * <p>
     * 示例 1:
     * <p>
     * 给定 matrix =
     * [
     * [1,2,3],
     * [4,5,6],
     * [7,8,9]
     * ],
     * <p>
     * 原地旋转输入矩阵，使其变为:
     * [
     * [7,4,1],
     * [8,5,2],
     * [9,6,3]
     * ]
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        Map<Integer, List<Integer>> columnMap = new HashMap<>(16);
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> list = new ArrayList<>(16);
            columnMap.put(i, list);
            for (int j = 0; j < matrix[i].length; j++) {
                columnMap.get(i).add(matrix[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int index = matrix.length - 1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (index >= 0) {
                    matrix[i][j] = columnMap.get(index).get(i);
                    index--;
                }
            }
        }
    }
}
