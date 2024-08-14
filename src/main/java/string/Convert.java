package string;

public class Convert {

    public static String convert(String s, int numRows) {
        String[][]  ss = new String[numRows][numRows];
        StringBuffer resultBuf = new StringBuffer();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<numRows;j++){
                for(int k=0;k<numRows;k++){
                    if(k==0 || k== numRows-1){
                        ss[j][k] = String.valueOf(s.charAt(i));
                    }
                    if(0<k && k<=numRows-1){
                        ss[k][numRows-k] = String.valueOf(s.charAt(i));
                    }
                }
            }
        }

        return s;
    }
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
}
