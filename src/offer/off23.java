package offer;

public class off23 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead,fast = pHead;
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while(slow != fast);

        fast = pHead;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
