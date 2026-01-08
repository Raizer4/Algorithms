package practice.leetcode.math.medium;

// Four Divisors
// https://leetcode.com/problems/four-divisors/description/?envType=daily-question&envId=2026-01-04

public class Leetcode_1390 {

    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    public static int sumFourDivisors(int[] nums) {
        int answer = 0;

        for (int temp : nums) {
            int count;
            int sum = 0;

            if (temp == 1){
                sum = 1;
                count = 1;
            }else {
                sum++;
                sum += temp;
                count = 2;
            }

            for (int i = 2; i < (temp / 2) + 1; i++) {
                if (temp % i == 0){
                    sum += i;
                    count++;
                }
                if (count > 4){
                    break;
                }
            }

            if (count == 4){
                answer += sum;
            }

        }

        return answer;
    }


}
