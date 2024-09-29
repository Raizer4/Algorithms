package practice.leetcode;

// Sort Array By Parity II
// https://leetcode.com/problems/sort-array-by-parity-ii/description/

public class Leetcode_922 {

    public static void main(String[] args) {
        int[] ints = sortArrayByParityII(new int[]{4, 2, 5, 7});

        for (Integer temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] sortArrayByParityII(int[] nums) {
       int i = 0;
       int j = 1;
       int n = nums.length;

       while(i < n && j < n){

           if (nums[i] % 2 == 1){
               while (nums[j] % 2 == 1){
                   j += 2;
               }

               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
           }

           i += 2;
       }

       return nums;
    }

}
