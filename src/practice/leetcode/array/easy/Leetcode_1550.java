package practice.leetcode.array.easy;

// Three Consecutive Odds
// https://leetcode.com/problems/three-consecutive-odds/description/

public class Leetcode_1550 {

    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int coutn = 0;

        for (int temp : arr){

            if (coutn == 3){
                return true;
            }

            if (temp % 2 ==1){
                coutn++;
            }else {
                coutn = 0;
            }
        }

        if (coutn == 3){
            return true;
        }

        return false;
    }

}
