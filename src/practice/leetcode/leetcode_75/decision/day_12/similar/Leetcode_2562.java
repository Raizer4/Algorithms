package practice.leetcode.leetcode_75.decision.day_12.similar;

public class Leetcode_2562 {

    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{5,14,13,8,12}));
        System.out.println(findTheArrayConcVal(new int[]{7,52,2,4}));
    }

    public static long findTheArrayConcVal(int[] nums) {
        int sum = 0;
        String concat = "";

        int i = 0;
        int j = nums.length - 1;

        while (i <= j){
            if (i == j){
                sum += nums[i];
                break;
            }

            concat += nums[i];
            concat += nums[j];
            sum += Integer.parseInt(concat);
            concat = "";
            i++;
            j--;
        }

        return sum;
    }

}
