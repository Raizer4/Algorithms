package practice.leetcode.linkedList;

// Intersection of Two Linked Lists
// https://leetcode.com/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY

public class Leetcode_160 {
    static class ListNode {
      int val;
      ListNode next;

      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        ListNode headC = new ListNode(1).next = new ListNode(2).next = new ListNode(3);
        ListNode headA = new ListNode(1).next = new ListNode(2). next = headC;
        ListNode headB = new ListNode(1).next = new ListNode(2).next = new ListNode(3).next = headC;
        ListNode result = getIntersectionNode(headA, headB);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp;

        while (headA != null){
            temp = headB;

            while(temp != null){
                if (headA == temp){
                    return temp;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }

}



