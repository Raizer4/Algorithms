package practice.leetcode.linkedList.easy;

// Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class Leetcode_83 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, null))));
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        ListNode listNode2 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
      ListNode currency = head;

      while(currency != null && currency.next != null){
        if (currency.val == currency.next.val){
            currency.next = currency.next.next;
        }else {
            currency = currency.next;
        }
      }

      return head;
    }


}
