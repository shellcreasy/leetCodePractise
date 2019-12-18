package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shell4j
 */
public class Intersect {
    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出: [2,2]
     * 示例 2:
     * <p>
     * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出: [4,9]
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> numList1 = new ArrayList<>(16);
        List<Integer> numList2 = new ArrayList<>(16);
        List<Integer> numList3 = new ArrayList<>(16);
        for (int i = 0; i < nums1.length; i++) {
            numList1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            numList2.add(nums2[i]);
        }

        Iterator<Integer> iterator1 = numList1.iterator();
        while (iterator1.hasNext()) {
            Iterator<Integer> iterator2 = numList2.iterator();
            int num = iterator1.next();
            while (iterator2.hasNext()) {
                int num1 = iterator2.next();
                if (num1 == num) {
                    numList3.add(num1);
                    iterator2.remove();
                    iterator1.remove();
                    break;
                }
            }
        }

        int[] resultArray = new int[numList3.size()];
        for (int i = 0; i < numList3.size(); i++) {
            resultArray[i] = numList3.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
