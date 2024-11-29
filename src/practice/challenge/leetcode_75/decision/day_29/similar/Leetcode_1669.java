package practice.challenge.leetcode_75.decision.day_29.similar;

// Merge In Between Linked Lists
// https://leetcode.com/problems/merge-in-between-linked-lists/description/

public class Leetcode_1669 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
        ListNode listNode = mergeInBetween(list1, 6, 9, list2);
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode last = list2;

        while (last.next != null) {
            last = last.next;
        }

        ListNode temp = list1;

        ListNode prevA = null;
        ListNode afterB = null;

        int index = 0;

        while (temp != null) {
            if (index == a - 1){
                prevA = temp;
            }
            if (index == b){
                afterB = temp.next;
            }
            temp = temp.next;
            index++;
        }

        prevA.next = list2;
        last.next = afterB;

        return list1;
    }

}
