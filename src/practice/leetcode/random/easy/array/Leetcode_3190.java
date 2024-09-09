package practice.leetcode.random.easy.array;

// Find Minimum Operations to Make All Elements Divisible by Three
// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/

public class Leetcode_3190 {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4}));
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];

            if (temp % 3 != 0){
                int num_1 = temp;
                int num_2 = temp;

                while (true){
                    count++;
                    num_1--;
                    num_2++;

                    if (num_1 % 3 == 0){
                        break;
                    }

                    if (num_2 % 3 == 0){
                        break;
                    }

                }
            }

        }

        return count;
    }

}
