package Arrays.Question_4;

import javax.naming.Binding;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,7,11,15};
        int[] arr2 = new int[]{1,10,4,11};

        for(Integer nbr: advantageCount(arr1, arr2)){
            System.out.print(nbr + " ");
        }

    }

    public static int[] advantageCount(int[] nums1, int[] nums2) {
        // la declaration de hash Map :
        Map<Integer, Integer> newMap = new HashMap<>();
        for(int i = 0 ; i < nums2.length; i++){
            newMap.put(i, nums2[i]);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i = 0 ; i < nums1.length; i++){
            if(nums1[i] < nums2[i]){
                int unused = nums1[i];
            }else {
                System.out.println(nums2[i]);
                 if(newMap.containsValue(nums2[i])){
                     System.out.println("indice"  + newMap.get(i));
                 }
            }
        }
        return nums1;
    }

}
