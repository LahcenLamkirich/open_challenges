package LinkedList.Question_1;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }
}


public class ReverseLinkedList {
    public static void main(String[] args) {
        List<ListNode> nodes = new ArrayList<>();
        nodes.addAll(
                List.of(
                        new ListNode(1),
                        new ListNode(2),
                        new ListNode(3),
                        new ListNode(4),
                        new ListNode(5)
                )
        );

        for(int i = 0 ; i < nodes.size(); i++){
            System.out.println(nodes.get(i).getVal());
        }

        int left = nodes.get(0).getVal() ;
        int right = nodes.get(nodes.size() - 1).getVal();

        System.out.println("******************* Reversed !! *************** ");
        System.out.println(left);
        for(int i = nodes.size() - 2 ; i >= 1; i--){
            System.out.println(nodes.get(i).getVal());
        }

        System.out.println(right);

    }
}
