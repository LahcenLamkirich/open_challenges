package Arrays.Question_3_divide_intervals;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] array_2d = {{1, 10}, {0, 5}, {1, 3}, {12, 15}};
        int result = minGroups(array_2d);
    }

    // Main Function :
    public static int minGroups(int[][] array_2d) {
        ArrayList<ArrayList<Integer>> minIntervale = getMinInterval(array_2d);
        for(ArrayList<Integer> integer: minIntervale){
            System.out.println(integer);
        }


        return 0;
    }

    // Get the min Value :
    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int i = 0 ; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < minValue ) {
                    minValue = numbers[i][j];
                }
            }
        }
        return minValue ;
    }

    public static ArrayList<ArrayList<Integer>> getMinInterval(int[][] array_2d){
        int min = getMinValue(array_2d);
        ArrayList<ArrayList<Integer>>  newCollection = new ArrayList<>();
        ArrayList<ArrayList<Integer>>  resultCollection = new ArrayList<>();
        int minRight = 0;

        for(int i = 0 ; i < array_2d.length; i++){
            for(int j = 0 ; j < 2 ; j++){
                if(min == array_2d[i][j]){
                    minRight = 1000000 ;
                    newCollection.add(new ArrayList<>(Arrays.asList(array_2d[i][0], array_2d[i][1])));
                    if(minRight > array_2d[i][1]){
                        minRight = array_2d[i][1];
                    }
                }

            }
        }

        System.out.println("The min right is : " + minRight);

        System.out.println("The list of the collection: ");
        for(int i  = 0 ; i < newCollection.size() ; i++){
                if(minRight == newCollection.get(i).get(1)){
                    resultCollection.add(new ArrayList<>(Arrays.asList(min, minRight)));
                }
        }

        System.out.println("*********************************");
        return resultCollection;
    }
}
