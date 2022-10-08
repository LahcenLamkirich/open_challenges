package Strings.Question_1.Question_2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }

    public static int numDecodings(String s) {
        // Variable declaration:
        int cmp = 0 ;
        List<String> passedString = new ArrayList<>();
        List<String> newMap = new ArrayList<>();
        for(int i = 1 ; i <= 26; i++){
            newMap.add(String.valueOf(i));
        }
        int d = 0 ;

        // Traitment:
        if(s.charAt(0) == '0')
            return 0 ;
        if(s.length() == 2){
            if(newMap.contains(s) && s.charAt(1)!='0'){
                return 2 ;
            }else {
                return 1 ;
            }
        }else if(s.length() == 1)
            return 1 ;

        // Here I will start the real traitment :
        System.out.println("The length : " + s.length());

        for(int i = 0 ; i < s.length(); i++){
            if(newMap.contains(String.valueOf(s.charAt(i)))){
                d = d + 1 ;
            }
        }
        //226 => 2 2 6
        if(d == s.length()) cmp++;
        // 3 caracters substring :
        if(newMap.contains(String.valueOf(s.charAt(0))) && newMap.contains(s.substring(1))) cmp++ ;
        if(newMap.contains(s.substring(0,2)) && newMap.contains(String.valueOf(s.charAt(s.length()-1)))) cmp++;

        // More Than 3 caracters :
        if(s.length() > 3)
            if(divideFunction(s)) cmp++ ;

        return cmp ;
    }

    public static boolean divideFunction(String s){
        int cmp = 0 ;
        List<String> passedString = new ArrayList<>();
        List<String> newMap = new ArrayList<>();
        for(int i = 1 ; i <= 26; i++){
            newMap.add(String.valueOf(i));
        }
        for(int i = 0 ; i < s.length(); i++){
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1);

            if(!str2.isEmpty()){

                if(!passedString.contains(str1))
                    if(newMap.contains(str1) && newMap.contains(str2))
                       return true ; // one

                if(!newMap.contains(str2) && !newMap.contains(str1)){
                    System.out.println("Concat : " + str2.charAt(0)+str1);
                    System.out.println("-> str2: " + str2);
                    if(str2.charAt(0) != '0'){
                        if(newMap.contains(str2.charAt(0) + str1 )){
                            passedString.add(str2.charAt(0)+str1);
                            return true ;// two
                        }
                    }
                }
            }
        }
        return false ;
    }


}
