package offer;

import java.util.ArrayList;

public class off6 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);

        ArrayList<Integer> arr = printListFromTailToHead(head);

        System.out.println(arr.toString());
    }

    public static void printList(ListNode last) {
        while (last != null) {
            System.out.print(last.val + ",");
            last = last.next;
        }
    }

    public static class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
}
