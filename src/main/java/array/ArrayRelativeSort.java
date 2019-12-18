package array;

import java.util.*;

/**
 * @author shell4j
 */
public class ArrayRelativeSort {
    /**
     * 给你两个数组，arr1 和 arr2，
     * <p>
     * arr2 中的元素各不相同
     * arr2 中的每个元素都出现在 arr1 中
     * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
     * <p>
     * 示例：
     * <p>
     * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * 输出：[2,2,2,1,4,3,3,9,6,7,19]
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        //返回结果数组初始化
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = -1;
        }

        //第一步：对arr1中在arr2出现的数字按出现顺序进行排列
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < resultArray.length; j++) {
                if (resultArray[j] == -1) {
                    resultArray[j] = arr2[i];
                    int count = 0;
                    for (int k = 0; k < arr1.length; k++) {
                        if (arr2[i] == arr1[k]) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        for (int k = 1; k < count; k++) {
                            resultArray[j + k] = resultArray[j];
                        }
                    }
                    break;
                }
            }
        }

        //第二步：对arr1在arr2中未出现的数字升序排在arr2的末尾
        Set<Integer> set1 = new HashSet<>(16);
        Set<Integer> set2 = new HashSet<>(16);
        TreeSet<Integer> set3 = new TreeSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        set1.removeAll(set2);
        set3.addAll(set1);

        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == -1) {
                Iterator<Integer> iterator = set3.iterator();
                while (iterator.hasNext()) {
                    Integer number = iterator.next();
                    resultArray[i] = number;
                    int count = 0;
                    for (int j = 0; j < arr1.length; j++) {
                        if (arr1[j] == number) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        for (int j = 1; j < count; j++) {
                            resultArray[i + j] = number;
                        }
                    }
                    iterator.remove();
                    break;
                }
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = relativeSortArray(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
