package practice.leetcode;

// Range Sum Query - Mutable
// https://leetcode.com/problems/range-sum-query-mutable/description/

public class Leetcode_307 {

    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{1, 3, 5});
        int param_1 = obj.sumRange(0, 2);
        obj.update(1,2);
        int param_2 = obj.sumRange(0, 2);
    }

    static class NumArray {
        int[] nums;
        int[] bit;
        int n;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.n = nums.length;
            this.bit = new int[n + 1];

            for (int i = 0; i < n; i++) {
                updateBIT(i + 1, nums[i]);
            }

        }

        private void updateBIT(int index, int delta) {
            while (index <= n){
                bit[index] += delta;
                index += index & (-index);
            }
        }

        private int getSum(int index){
            int sum = 0;
            while (index > 0){
                sum += bit[index];
                index -= index & (-index);
            }
            return sum;
        }

        public void update(int index, int value) {
            int delta = value - nums[index];
            nums[index] = value;
            updateBIT(index + 1, delta);
        }

        public int sumRange(int left, int right) {
            return getSum(right + 1) - getSum(left);
        }
    }

}
