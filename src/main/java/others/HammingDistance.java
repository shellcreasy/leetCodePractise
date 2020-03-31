package others;

/**
 * @author shell
 * @date 2020.3.20
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int larger=0,smaller=0,hammingDis=0;
        if(x>y){
            larger = x;
            smaller = y;
        }
        else{
            larger = y;
            smaller = x;
        }
        StringBuilder stbS = new StringBuilder(Integer.toBinaryString(smaller));
        StringBuilder stbL = new StringBuilder(Integer.toBinaryString(larger));
        StringBuilder stbS1 = new StringBuilder();
        if(stbS.length() < stbL.length()){
            for(int i= 0;i<stbL.length()-stbS.length();i++){
                stbS1.append("0");
            }
        }
        stbS1.append(stbS);
        for(int i=0;i<stbL.length();i++){
            if(!String.valueOf(stbL.charAt(i)).equals(String.valueOf(stbS1.charAt(i)))){
                hammingDis++;
            }
        }
        return hammingDis;
    }

    public static void main(String[] args) {
        int x = 1,y = 4 ;
        System.out.print(hammingDistance(x,y));
    }
}
