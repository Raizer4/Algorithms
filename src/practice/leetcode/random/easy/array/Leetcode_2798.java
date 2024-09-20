package practice.leetcode.random.easy.array;

// Number of Employees Who Met the Target
// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

public class Leetcode_2798 {

    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4},2));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for(int temp : hours){
            if (temp >= target){
                count++;
            }
        }
        return count;
    }

}
