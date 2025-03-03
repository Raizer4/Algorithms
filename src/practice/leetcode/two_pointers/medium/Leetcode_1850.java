package practice.leetcode.two_pointers.medium;

// Minimum Adjacent Swaps to Reach the Kth Smallest Number
// https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/description/

public class Leetcode_1850 {

    public static void main(String[] args) {
        System.out.println(getMinSwaps("5489355142",4));
        System.out.println(getMinSwaps("11112",4));
        System.out.println(getMinSwaps("00123",1));
    }

    public static int getMinSwaps(String num, int k) {
        StringBuilder builder = new StringBuilder(num);

        for (int i = 0; i < k; i++) {
            builder = new StringBuilder(nextPermutation(builder.toString()));
        }

        StringBuilder temp = new StringBuilder(num);

        int count = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != builder.charAt(i)) {
                int j = i;

                while (temp.charAt(j) != builder.charAt(i)) {
                    j++;
                }

                while (j > i) {
                    char c = temp.charAt(j);
                    temp.setCharAt(j, temp.charAt(j - 1));
                    temp.setCharAt(j - 1, c);

                    j--;
                    count++;
                }
            }
        }

        return count;
    }

    private static String nextPermutation(String num) {
        char[] arr = num.toCharArray();
        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

}
