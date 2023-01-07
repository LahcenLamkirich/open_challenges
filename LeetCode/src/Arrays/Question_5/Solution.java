package Arrays.Question_5;

public class Solution {
    public static void main(String[] args) {

    }

    public static int[][] findArray(int[][] input){
        int[][] res = new int[input.length][2];
        for (int i = 0; i < input.length; i++) {
                if(input[i][0] > input[i][1]){
                    res[i][0] = 600 ;
                }else {
                    res[i][1] = 600 ;
            }
        }
        return new int[][]{};
    }

}
