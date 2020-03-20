package math;

/**
 * @author shell
 * @date 2020.3.20
 */
public class IsPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n/3 == 1 && n%3 ==0 || n==1){
            return true;
        }
        if(n/3 <= 0){
            return false;
        }
        if(n/3 >1 && n/3 <3){
            return false;
        }
        if(n/3 >= 3 && n%3 == 0){
            boolean  result = isPowerOfThree(n/3);
            if(result){
                return result;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int i= 19684;
       System.out.println(isPowerOfThree(i));
    }
}
