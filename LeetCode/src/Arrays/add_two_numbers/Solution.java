package Arrays.add_two_numbers;

import java.util.LinkedList;

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

        // And then reverse the result :         

    }
}
