package practice.leetcode.linkedList.medium;

// Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/description/

public class Leetcode_287 {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast){
                break;
            }
        }

        int slow2 = 0;

        while (true){
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2){
                return slow;
            }
        }

    }

}
