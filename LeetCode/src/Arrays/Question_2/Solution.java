package Arrays.Question_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println("************** Solution 2 ****************");
        int[] height = new int[]{1,5,3,2};
        System.out.println("The max is : " + maxArea(height));
    }
    public static int maxArea(int[] height) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> newList2 = new ArrayList<>();
        int max2 = 0 ;
        int max1 = 0 ;
        int size = height.length;
        for(int i = 0 ; i < size; i++){
            int k = i + 1 ;
            for(int j = k ; j < size; j++){
                if(height[j] == height[i]){
                    int distance = Math.abs(i-j);
                    newList.add(height[i]*distance);
                    max1 = newList.stream().max(Integer::compare).get();
                }else {
                    int min = Math.min(height[i],height[j]);
                    int distance2 = Math.abs(i-j);
                    newList2.add(min*distance2);
                    max2 = newList2.stream().max(Integer::compare).get();
                }
            }
        }

        int maxResult = Math.max(max1,max2);
        return maxResult;
    }
}
