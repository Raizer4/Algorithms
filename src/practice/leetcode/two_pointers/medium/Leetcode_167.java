package practice.leetcode.two_pointers.medium;

// Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

public class Leetcode_167 {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j){
            int sum = numbers[i] + numbers[j];

            if (sum == target){
                return new int[]{i + 1,j + 1};
            }else if (sum > target){
                j--;
            }else {
                i++;
            }
        }

        return new int[]{};
    }

}
