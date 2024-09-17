package practice.leetcode.linkedList.medium;

// Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=linked-list&difficulty=MEDIUM

import java.math.BigInteger;

public class Leetcode_2 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(8))));

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder builder_1 = new StringBuilder();
        StringBuilder builder_2 = new StringBuilder();

        while (l1 != null){
            builder_1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            builder_2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger res_1 = new BigInteger(builder_1.reverse().toString());
        BigInteger res_2 = new BigInteger(builder_2.reverse().toString());
        BigInteger res = res_1.add(res_2);


        StringBuilder builder = new StringBuilder(String.valueOf(res)).reverse();


        ListNode dummy = new ListNode(0);
        ListNode currency = dummy;
        int i = 0;

        while(i < builder.length()){
            while (currency.next != null){
                currency = currency.next;
            }
            currency.next = new ListNode(Integer.parseInt(String.valueOf(builder.charAt(i))));
            i++;
        }

        return dummy.next;
    }

}
