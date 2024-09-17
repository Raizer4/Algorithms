package practice.leetcode.linkedList.easy;

// Convert Binary Number in a Linked List to Integer
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY

public class Leetcode_1290 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args) {
        System.out.println(getDecimalValue(new ListNode(1,new ListNode(0,new ListNode(1)))));
    }

    public static int getDecimalValue(ListNode head) {
      StringBuilder builder = new StringBuilder();
      ListNode currency = head;

      while (currency != null){
          builder.append(currency.val);
          currency = currency.next;
      }

     return Integer.parseInt(builder.toString(),2);
    }

}
