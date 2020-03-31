package others;

/**
 * @author shell
 * @date 2020.3.20
 */
public class ReverseBits {
    public static int reverseBits(int n) {
        StringBuilder stb = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder stb0 = new StringBuilder();
        for(int i=0;i<32-stb.length();i++){
            stb0.append("0");
        }
        return Long.valueOf(stb0.append(stb).reverse().toString(),2).intValue();
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(-3));
    }
}
