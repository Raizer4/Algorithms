package practice.leetcode;

// Candy
// https://leetcode.com/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150

public class Leetcode_135 {

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,2,87,87,87,2,1}));
    }

    public static int candy(int[] ratings) {
        int count = 0;

        int k = 0;
        int l = 1;

        int temp = 1;

        while (l < ratings.length && ratings[k] > ratings[l]){
            temp++;
            k++;
            l++;
        }

        int[] arr_1 = new int[ratings.length];
        int[] arr_2 = new int[ratings.length];

        arr_1[0] = temp;
        arr_2[0] = 0;

        for (int i = 1; i < ratings.length - 1; i++) {
            if (ratings[i - 1] >= ratings[i]){
                arr_1[i] = 1;
            }else {
                arr_1[i] = arr_1[i - 1] + 1;
            }
        }

        k = ratings.length - 1;
        l = ratings.length - 2;

        temp = 1;

        while (l >= 0 && ratings[k] > ratings[l]){
            temp++;
            l--;
            k--;
        }

        arr_2[ratings.length - 1] = temp;


        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] <= ratings[i + 1]){
                arr_2[i] = 1;
            }else {
                arr_2[i] = arr_2[i + 1] + 1;
            }
        }

        for (int i = 0; i < ratings.length; i++) {
           count += Math.max(arr_1[i], arr_2[i]);
        }

        return count;
    }

}
