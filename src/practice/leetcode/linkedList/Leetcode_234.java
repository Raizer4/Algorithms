package practice.leetcode.linkedList;



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
        return false;
    }

}
