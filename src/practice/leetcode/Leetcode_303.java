package practice.leetcode;

// Range Sum Query - Immutable
// https://leetcode.com/problems/range-sum-query-immutable/description/

public class Leetcode_303 {

    public static void main(String[] args) {

    }

    static class NumArray {
        int[] nums;
        int[] bit;
        int n;

        public NumArray(int[] nums){
            this.nums = nums;
            this.n = nums.length;
            bit = new int[n + 1];

            for (int i = 0; i < nums.length; i++){
                updateBIT(i + 1, nums[i]);
            }

        }

        private void updateBIT(int index, int delta){
            while(index <= n){
                bit[index] += delta;
                index += index & (-index);
            }
        }

        private int getSum(int index){
            int sum = 0;
            while(index > 0){
                sum += bit[index];
                index -= index & (-index);
            }
            return sum;
        }

        public int sumRange(int left, int right){
            return getSum(right + 1) - getSum(left);
        }


    }



}
