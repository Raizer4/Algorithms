package practice.leetcode.design.medium;

// Finding Pairs With a Certain Sum
// https://leetcode.com/problems/finding-pairs-with-a-certain-sum/description/?envType=daily-question&envId=2025-07-06

import java.util.HashMap;

public class Leetcode_1865 {

    public static void main(String[] args) {
        FindSumPairs findSumPairs = new FindSumPairs(new int[]{1, 1, 2, 2, 2, 3}, new int[]{1, 4, 5, 2, 5, 4});
        findSumPairs.count(7);  // return 8; pairs (2,2), (3,2), (4,2), (2,4), (3,4), (4,4) make 2 + 5 and pairs (5,1), (5,5) make 3 + 4
        findSumPairs.add(3, 2); // now nums2 = [1,4,5,4,5,4]
        findSumPairs.count(8);  // return 2; pairs (5,2), (5,4) make 3 + 5
        findSumPairs.count(4);  // return 1; pair (5,0) makes 3 + 1
        findSumPairs.add(0, 1); // now nums2 = [2,4,5,4,5,4]
        findSumPairs.add(1, 1); // now nums2 = [2,5,5,4,5,4]
        findSumPairs.count(7);  // return 11; pairs (2,1), (2,2), (2,4), (3,1), (3,2), (3,4), (4,1), (4,2), (4,4) make 2 + 5 and pairs (5,3), (5,5) make 3 + 4
    }

    static class FindSumPairs {
        private int[] nums1;
        private int[] nums2;
        private HashMap<Integer, Integer> freq1;
        private HashMap<Integer, Integer> freq2;

        public FindSumPairs(int[] nums1, int[] nums2) {
            this.nums1 = nums1;
            this.nums2 = nums2;

            freq1 = new HashMap<>();
            for (int num : nums1) {
                freq1.put(num, freq1.getOrDefault(num, 0) + 1);
            }

            freq2 = new HashMap<>();
            for (int num : nums2) {
                freq2.put(num, freq2.getOrDefault(num, 0) + 1);
            }
        }

        public void add(int index, int val) {
            int temp = nums2[index];
            Integer integer = freq2.get(temp);

            if (integer == 1){
                freq2.remove(temp);
            }else {
                freq2.put(temp, integer - 1);
            }

            nums2[index] += val;
            freq2.put(nums2[index], freq2.getOrDefault(nums2[index], 0) + 1);
        }

        public int count(int tot) {
            int count = 0;
            for (int num : freq1.keySet()){
                int i = tot - num;
                count += freq1.get(num) * freq2.getOrDefault(i, 0);
            }
            return count;
        }
    }

}
