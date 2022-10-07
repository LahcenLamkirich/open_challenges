package Strings.Question_1.Question_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numDecodings("ABC"));
    }

    public static int numDecodings(String s) {
        Map<String, String> newMap = new HashMap<>();
        int k = 1 ;
        if(s.charAt(0) == '0')
            return 0 ;
        for(int i = 65 ; i < 91 ; i++){
            char caractere = (char) i;
            newMap.put(String.valueOf(caractere), String.valueOf(k));
            k = k + 1 ;
        }

        return -1 ;
    }
}
