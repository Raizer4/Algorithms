package practice.leetcode.array.easy;

// Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/description/

public class Leetcode_1470 {

    public static void main(String[] args) {
        int[] shuffle = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        for (int temp : shuffle){
            System.out.println(temp);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr_1 = new int[nums.length / 2];
        int[] arr_2 = new int[nums.length / 2];

        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (i < n){
                arr_1[i] = nums[i];
            }else {
                arr_2[j] = nums[i];
                j++;
            }
        }

        int[] result = new int[nums.length];
        int k = 0;

        for (int i = 0; i < result.length /2; i++){
            result[k] = arr_1[i];
            k++;
            result[k] = arr_2[i];
            k++;
        }

        return result;
    }

}
