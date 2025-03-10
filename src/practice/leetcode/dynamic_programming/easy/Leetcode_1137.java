package practice.leetcode.dynamic_programming.easy;

// N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }

    public static int tribonacci(int n) {
        if (n < 3){
            if (n == 0){
                return 0;
            }else {
                return 1;
            }
        }

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        return arr[n];
    }

}
