package Arrays.Question_3_divide_intervals;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] array_2d = {{1, 10}, {0, 5}, {1, 3}, {12, 15}};
        int[][] array_test1 = {{0,5}};
        int[][] array_test2 = {{6,8}};

        int result = minGroups(array_2d);
        System.out.println("Test Intersection : ");
        System.out.println(isNotIntersect(array_test1,array_test2));

    }

    // Main Function :
    public static int minGroups(int[][] array_2d) {
        Stack<List<Integer>> stack = new Stack<>();
        int cmp =  0 ;
        ArrayList<ArrayList<Integer>> minIntervale = getMinInterval(array_2d);
        for(ArrayList<Integer> integer: minIntervale){
            System.out.println(integer);
            stack.push(integer);
            cmp++;
        }
        System.out.println("The stack : " + stack);

        System.out.println("The compteur: " + cmp);
        return 0;
    }
    /*********************** Main function ****************************/
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
        Stack<List<Integer>> minIntervalStack = new Stack<>();
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
//                    minIntervalStack.push(new ArrayList<>(Arrays.asList(min, minRight)));
//                    minIntervalStack.pop();
                }
        }

        return resultCollection;
    }

    public static boolean isNotIntersect(int[][] firstInterval, int[][] secondeInterval){
        ArrayList<ArrayList<Integer>>  testCollection = new ArrayList<>();

        for(int i = 0 ; i < firstInterval.length; i++){
            for (int j = 0 ; j < 2 ; j++){
                  if(secondeInterval[i][0] > firstInterval[i][1]){
                      return true ;
                  }
            }
        }
        return false ;
    }
}
