package practice.leetcode.array.easy;

// How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class Leetcode_1365 {

    public static void main(String[] args) {
        int[] ints = smallerNumbersThanCurrent(new int[]
                {6,5,4,8});
        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] res = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (num > nums[j]){
                    count++;
                }
            }

            res[index++] = count;
        }

        return res;
    }

}
