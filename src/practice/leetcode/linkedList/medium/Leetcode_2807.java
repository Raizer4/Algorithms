package practice.leetcode.linkedList.medium;

// Insert Greatest Common Divisors in Linked List
// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/

public class Leetcode_2807 {

  static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = insertGreatestCommonDivisors(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
      ListNode current = head;
      ListNode next = null;

      int index = 0;

      while (current.next != null){
          if (index % 2 == 0){
              int temp = gsd(current.val,current.next.val);
              ListNode gsd = new ListNode(temp);
              next = current.next;
              current.next = gsd;
              gsd.next = next;
          }
          index++;
          current = current.next;
      }

      return head;
    }

    private static int gsd(int a, int b){
        if (b == 0){
            return a;
        }else {
           return gsd(b,a%b);
        }
    }

}
