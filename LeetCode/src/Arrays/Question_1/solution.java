package Arrays.Question_1;

public class solution {
    public static void main(String[] args) {
        System.out.println("************** Solution 1 ****************");
        int[] numbers = new int[]{6,7,10,12,15};
        int target = 27 ;
        for(int i = 0 ; i < twoSum(numbers,target).length; i++){
            System.out.println(twoSum(numbers, target)[i]);
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
}

