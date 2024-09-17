package practice.leetcode.linkedList.easy;

// Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY

import java.util.ArrayList;

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
        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int k = list.size() -1;

        while (i <= k){
            if (list.get(i) != list.get(k)){
                return false;
            }
            i++;
            k--;
        }

        return true;
    }

}
