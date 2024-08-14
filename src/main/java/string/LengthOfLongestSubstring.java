package string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.SortedSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        int length = 0;
        for(int i=0;i<s.length();i++){
            String tmpStr = String.valueOf(s.charAt(i));
            if(!set.contains(tmpStr)){
                set.add(tmpStr);
            }else{
                if(set.size() >length){
                    length = set.size();
                    set.clear();
                    set.add(tmpStr);
                }
            }
        }

        if(set.size() > length){
            length = set.size();
        }
        return length;
    }

    public static void main(String[] args){
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
