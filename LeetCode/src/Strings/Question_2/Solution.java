package Strings.Question_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        int res = solution(15 );
        System.out.println(res);
    }
    public static int solution(int n) {
        String res = Integer.toBinaryString(n);
        List<Integer> arr = new ArrayList<>();
        Boolean isStart = false ;
        int length = 0 ;

        for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i) == '1'){
                isStart = true;

                if(i > 0) {
                    arr.add(length);
                    length = 0;
                }
            }
            if(res.charAt(i) == '0' && isStart){
                length++;
            }

        }

        if(arr.size() == 0)
            return 0;

        Optional<Integer> max = arr.stream().max((o1, o2) -> {
            return o1 > o2 ? o1 : o2 ;
        });

        return max.get();
    }
}
