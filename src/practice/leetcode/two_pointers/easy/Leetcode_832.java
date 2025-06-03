package practice.leetcode.two_pointers.easy;

// Flipping an Image
// https://leetcode.com/problems/flipping-an-image/description/

public class Leetcode_832 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,0},{1,0,1},{0,0,0}};

        int[][] ints = flipAndInvertImage(arr);

        for (int[] temp : ints){
            for (int val : temp){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];

        int i = 0;

        for (int[] temp : image){
            arr[i++] = reverse(temp);
        }

        return arr;
    }

    private static int[] reverse(int[] arr){
        int l = 0;
        int r = arr.length - 1;

        while (l <= r){
            int temp_1 = arr[l] == 1 ? 0 : 1;
            int temp_2 = arr[r] == 1 ? 0 : 1;

            arr[r] = temp_1;
            arr[l] = temp_2;

            l++;
            r--;
        }

        return arr;
    }

}
