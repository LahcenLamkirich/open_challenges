package Arrays.Question_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        System.out.println("************** Solution 1 ****************");
        int[] numbers = new int[]{1,3,4,2};
        int target = 5 ;
        for(int i = 0 ; i < twoSumOptimal(numbers,target).length; i++){
            System.out.println(twoSumOptimal(numbers, target)[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int somme;
        int size = nums.length ;
        for (int i = 0; i < size; i++) {
            somme = nums[i];
            for (int j = i+1; j < size; j++) {
                if (somme + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumOptimal(int[] nums, int target){
        Map<Integer, Integer> newHashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];

            if(newHashMap.containsKey(val)){
                return new int[]{newHashMap.get(val),i};
            }
            newHashMap.put(nums[i],i);
        }
        return null;
    }

}

