package practice.leetcode.linkedList.easy;

// Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY


public class Leetcode_141 {

   static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(2).next = new ListNode(0).next = new ListNode(4).next = listNode1;
        System.out.println(hasCycle(listNode1));

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(3).next = new ListNode(1).next = new ListNode(7);
        System.out.println(hasCycle(listNode2));
    }

    public static boolean hasCycle(ListNode head) {
       ListNode sloy = head;
       ListNode fast = head;

       while (fast != null && fast.next != null){
           sloy = sloy.next;
           fast = fast.next.next;

           if (sloy == fast){
               return true;
           }
       }

       return false;
    }

}
