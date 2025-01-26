package practice.leetcode.linkedList.medium;

// Add Two Numbers II
// https://leetcode.com/problems/add-two-numbers-ii/description/

import java.math.BigInteger;

public class Leetcode_445 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String temp_1 = "";
        String temp_2 = "";

        while (l1 != null){
            temp_1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null){
            temp_2 += l2.val;
            l2 = l2.next;
        }

        BigInteger bigInteger_1 = new BigInteger(temp_1);
        BigInteger bigInteger_2 = new BigInteger(temp_2);

        String temp = String.valueOf(bigInteger_1.add(bigInteger_2));

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int i = 0;

        while (i < temp.length()){
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(temp.charAt(i++))));
            current.next = node;
            current = node;
        }


        return dummy.next;
    }

}
