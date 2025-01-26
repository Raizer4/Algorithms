package practice.leetcode.linkedList.medium;

// Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=linked-list&difficulty=MEDIUM


public class Leetcode_2 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode current = new ListNode(0);
       ListNode dummy = current;

       int cur = 0;
       while (l1 != null || l2 != null || cur != 0){
           int v1 = (l1 != null) ? l1.val : 0;
           int v2 = (l2 != null) ? l2.val : 0;

           int temp = v1 + v2 + cur;
           cur = temp / 10;
           int val = temp % 10;
           ListNode node = new ListNode(val);

           dummy.next = node;
           dummy = dummy.next;

           l1 = (l1.next != null) ? l1 = l1.next : null;
           l2 = (l2.next != null) ? l2 = l2.next : null;
       }

       return current.next;
    }

}
