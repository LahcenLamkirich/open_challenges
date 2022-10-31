package Arrays.add_two_numbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(2);
        firstLinkedList.add(4);
        firstLinkedList.add(3);

        secondLinkedList.add(5);
        secondLinkedList.add(6);
        secondLinkedList.add(4);

        // Reverse the first One :
        firstLinkedList.forEach(number -> {
            System.out.println(number);
        });
        // Reverse the second One :
        secondLinkedList.forEach(number -> {
            System.out.println(number);
        });

        int res = 243 + 567 ;
        System.out.println(res);

        // And then reverse the result :         
        int number = 458 ;
        String str = String.valueOf(number);
        System.out.println();
        System.out.println();
        char[] listChar = str.toCharArray();

        for(int i = 0 ; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

        System.out.println("Reversed !");
        for(int i = listChar.length - 1; i >=0; i--){
            System.out.println(listChar[i]);
        }


    }
}
