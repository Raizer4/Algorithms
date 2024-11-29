package practice.challenge.leetcode_75.decision.day_29;

// Delete the Middle Node of a Linked List
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_2095 {

    static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode_2 = deleteMiddle(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode listNode_1 = deleteMiddle(new ListNode(1, new ListNode(2)));


        while (listNode_1 != null){
            System.out.print(listNode_1.val + " ");
            listNode_1 = listNode_1.next;
        }

        System.out.println();

        while (listNode_2 != null){
            System.out.print(listNode_2.val + " ");
            listNode_2 = listNode_2.next;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            prev.next = slow;
            prev = prev.next;
            slow = slow.next;
        }

        prev.next = slow.next;

        return dummy.next;
    }


}
