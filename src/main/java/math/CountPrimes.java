package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shell
 * @date 2020.3.17
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        int count =0;
        if(n == 0 || n ==1){
            return 0;
        }else{
            for(int i=2;i<n;i++){
                List<Integer> intSet = new ArrayList<>();
                for(int j=1;j<=i;j++){
                    if(i%j == 0){
                        intSet.add(j);
                    }
                }
                if(intSet.size() == 2){
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int n = 499979;
        System.out.print(countPrimes(n));
    }
}
