package practice.challenge.leetcode_75.decision.day_8.similar;

// Lemonade Change
// https://leetcode.com/problems/lemonade-change/description/

public class Leetcode_860 {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int sum = 0;

        for (int temp : bills){
            if (temp == 5){
                five += 5;
                sum += 5;
            }else if (temp == 10){
                five -= 5;
                sum -= 5;
                if (five >= 0){
                    sum += 10;
                }else {
                    return false;
                }
            }else {
                sum -= 15;
                if (sum < 0 || five == 0){
                    return false;
                }
            }
        }

        return true;
    }

}
