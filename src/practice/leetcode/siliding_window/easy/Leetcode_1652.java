package practice.leetcode.siliding_window.easy;

// Defuse the Bomb
// https://leetcode.com/problems/defuse-the-bomb/description/

public class Leetcode_1652 {

    public static void main(String[] args) {
        int[] decrypt1 = decrypt(new int[]{5, 7, 1, 4}, 3);
        int[] decrypt2 = decrypt(new int[]{1, 2, 3, 4}, 0);
        int[] decrypt3 = decrypt(new int[]{2, 4, 9, 3}, -2);

        for (int temp : decrypt1){
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int temp : decrypt2){
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int temp : decrypt3){
            System.out.print(temp + " ");
        }

    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];

        if (k == 0){
            return arr;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0){
                for (int j = 1; j <= k; j++) {
                    sum += code[((i + j) % n)];
                }
            }else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            arr[i] = sum;
        }

        return arr;
    }

}
