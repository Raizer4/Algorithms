package practice.leetcode.linkedList.easy;

// Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/description/


public class Leetcode_21 {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode two = new ListNode(1,new ListNode(3,new ListNode(4,null)));
        ListNode listNode = mergeTwoLists(one, two);

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode dummy = new ListNode(0);
      ListNode currency = dummy;

      while(list1 != null && list2 != null){

          if (list1.val <= list2.val){
              currency.next = list1;
              list1 = list1.next;
          }else{
              currency.next = list2;
              list2 = list2.next;
          }

          currency = currency.next;
      }

      if (list1 != null){
          currency.next = list1;
      }else {
          currency.next = list2;
      }

      return dummy.next;
    }

}
