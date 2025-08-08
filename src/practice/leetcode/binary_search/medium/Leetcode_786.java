package practice.leetcode.binary_search.medium;

// K-th Smallest Prime Fraction
// https://leetcode.com/problems/k-th-smallest-prime-fraction/description/

public class Leetcode_786 {

    public static void main(String[] args) {
        int[] ints = kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3);

        for (int temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double left = 0.0;
        double right = 1.0;

        int[] result = new int[2];

        while (right - left > 1e-9){
            double mid = (left + right) / 2;
            int count = 0;

            int bestI = 0;
            int bestJ = 0;

            double maxFraction = 0.0;

            int j = 1;

            for (int i = 0; i < arr.length - 1; i++) {
                while (j < arr.length && ((double) arr[i] / (double) arr[j]) > mid){
                    j++;
                }

                count += arr.length - j;

                if (j < arr.length){
                    double currentFraction = (double) arr[i] / arr[j];
                    if (currentFraction > maxFraction){
                        maxFraction = currentFraction;
                        bestI = i;
                        bestJ = j;
                    }
                }
            }

            if (count == k){
                result[0] = arr[bestI];
                result[1] = arr[bestJ];
                return result;
            }else if (count < k){
                left = mid;
            }else {
                right = mid;
            }
        }

        return result;
    }



}
