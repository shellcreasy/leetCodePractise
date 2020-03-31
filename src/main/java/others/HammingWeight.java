package others;

/**
 * @author shell
 * @date 2020.3.20
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int countOne = 0;
        String binaryStr = Integer.toBinaryString(n);
        for(int i=0;i<binaryStr.length();i++){
            if(String.valueOf(binaryStr.charAt(i)).equals("1")){
                countOne++;
            }
        }
        return countOne;
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.print(hammingWeight(i));
    }
}
