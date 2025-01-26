package practice.leetcode.linkedList.medium;

// Spiral Matrix IV
// https://leetcode.com/problems/spiral-matrix-iv/description/

public class Leetcode_2326 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(3,
                new ListNode(0,
                        new ListNode(2,
                                new ListNode(6,
                                        new ListNode(8,
                                                new ListNode(1,
                                                        new ListNode(7,
                                                                new ListNode(9,
                                                                        new ListNode(4,
                                                                                new ListNode(2,
                                                                                        new ListNode(5,
                                                                                                new ListNode(5,
                                                                                                        new ListNode(0)))))))))))));

        int[][] result = spiralMatrix(3, 5, head);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        ListNode current = head;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right && current != null; j++) {
                matrix[top][j] = current.val;
                current = current.next;
            }
            top++;


            for (int i = top; i <= bottom && current != null; i++) {
                matrix[i][right] = current.val;
                current = current.next;
            }
            right--;


            for (int j = right; j >= left && current != null; j--) {
                matrix[bottom][j] = current.val;
                current = current.next;
            }
            bottom--;


            for (int i = bottom; i >= top && current != null; i--) {
                matrix[i][left] = current.val;
                current = current.next;
            }
            left++;
        }

        return matrix;
    }

}
