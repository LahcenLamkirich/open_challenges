package Strings.Question_1.Question_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numDecodings("1201234"));
    }

    public static int numDecodings(String s) {
        Map<String, String> newMap = new HashMap<>();
        List<String> passedString = new ArrayList<>();
        int k = 1 ;
        int cmp = 1 ;

        if(s.charAt(0) == '0')
            return 0 ;

        // Create a hash map :
        for(int i = 65 ; i < 91 ; i++){
            char caractere = (char) i;
            newMap.put(String.valueOf(caractere), String.valueOf(k));
            k = k + 1 ;
        }


        if((s.length() == 2) && s.charAt(s.length()-1) != '0'){
            if(newMap.containsValue(s)){
                return 2 ;
            }else{
                return 1 ;
            }
        }
        // Traitement : 227 => 2 2 7 => 22 7 ===> 2
        for(int i = 0 ; i < s.length(); i++){
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1);

            if(s.length() == 2){
                String strComplet = s ;
                if(newMap.containsValue(strComplet)){
                  cmp = 1 ;
                }
            }
            if(!str2.isEmpty()){
                System.out.println("str1: "+ str1);
                System.out.println("str2: "+ str2);


                if(!passedString.contains(str1))
                    if(newMap.containsValue(str1) && newMap.containsValue(str2))
                        cmp++ ; // one

                if(!newMap.containsValue(str2) && !newMap.containsValue(str1)){
                    System.out.println("Concat : " + str2.charAt(0)+str1);
                    System.out.println("-> str2: " + str2);
                    if(str2.charAt(0) != '0'){
                        if(newMap.containsValue(str2.charAt(0) + str1 )){
                            passedString.add(str2.charAt(0)+str1);
                            cmp++ ; // two
                        }
                    }
                }
            }
        }
        return cmp ;
    }
}
