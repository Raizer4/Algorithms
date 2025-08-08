package practice.leetcode.siliding_window.medium;

// Number of Subarrays with Bounded Maximum
// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/description/

public class Leetcode_795 {

    public static void main(String[] args) {
        System.out.println(numSubarrayBoundedMax(new int[]{34,46,51,92,50,61,49,82,4,4}, 18, 84));
    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        long answer = 0;
        long nefr = 0;
        long count = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] < left){
                int temp = r;
                int num = 0;

                while (temp < nums.length && nums[temp] < left){
                    temp++;
                    num++;
                }

                nefr += (num * (num + 1)) / 2;
                r = temp - 1;
                count += num;
            }else if (nums[r] > right){
                if (r == l){
                    l = r + 1;
                    continue;
                }

                int n = (r - l);

                answer += ((n * (n + 1)) / 2);
                answer -= nefr;

                nefr = 0;
                count = 0;
                l = r + 1;
            }else {
                count++;
            }

        }

        if (count > 0){
            answer += ((count * (count + 1)) / 2);
            answer -= nefr;
        }

        return (int) answer;
    }

}
