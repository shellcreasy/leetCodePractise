package array;

import java.util.*;

/**
 * @author shell4j
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(i<prices.length-1 && prices[i]<prices[i+1]){
                profit = profit + prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] arsg){
        int[]  prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
