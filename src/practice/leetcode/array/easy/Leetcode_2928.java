package practice.leetcode.array.easy;

// Distribute Candies Among Children I
// https://leetcode.com/problems/distribute-candies-among-children-i/description/?envType=problem-list-v2&envId=combinatorics

public class Leetcode_2928 {

    public static void main(String[] args) {
        System.out.println(distributeCandies(5,2));
    }

    public static int distributeCandies(int n, int limit) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i > limit){break;}

            for (int j = 0; j <= n; j++) {
                if (j > limit){break;}

                for (int k = 0; k <= n; k++) {
                    int i1 = i + j + k;

                    if (k > limit){break;}

                    if (i1 == n){
                        count++;
                    }

                }
            }
        }

        return count;
    }

}
