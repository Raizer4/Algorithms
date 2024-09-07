package practice.leetcode.linkedList;

// Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY

import java.util.ArrayList;
import java.util.List;

public class Leetcode_234 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))))));
        System.out.println(isPalindrome(new ListNode(1,new ListNode(2,null))));
        System.out.println(isPalindrome(new ListNode(1,new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(1)))))));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size()-1;

        while(left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }

        return left >= right;
    }

}
