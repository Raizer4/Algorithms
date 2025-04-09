package practice.leetcode.array.easy;

// Find the Distance Value Between Two Arrays
// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/

public class Leetcode_1385 {

    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for (int temp : arr1){
            boolean flag = true;

            for (int it : arr2){
                if (Math.abs(temp - it) <= d){
                    flag = false;
                    break;
                }
            }

            if (flag){
                count++;
            }

        }

        return count;
    }

}
