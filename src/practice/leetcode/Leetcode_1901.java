package practice.leetcode;

// Find a Peak Element II
// https://leetcode.com/problems/find-a-peak-element-ii/description/

public class Leetcode_1901 {

    public static void main(String[] args) {
        System.out.println(findPeakGrid(new int[][]{{2,3,4,5}}));
    }

    public static int[] findPeakGrid(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length == 1){
                continue;
            }

            int index = findPeakLeftElement(mat[i]);
            int temp = findPeakRightElement(mat[i]);

            if (temp != -1){
                int num = mat[i][temp];

                if (i == 0 && i != mat.length - 1){
                    if(num > mat[i + 1][temp]){
                        return new int[]{i, temp};
                    }
                }else if (i == mat.length - 1 && i != 0){
                    if (num > mat[i - 1][temp]){
                        return new int[]{i, temp};
                    }
                } else if (i == mat.length - 1 && i == 0) {
                    return new int[]{i, temp};
                } else {
                    if ((num > mat[i - 1][temp]) && (num > mat[i + 1][temp])){
                        return new int[]{i, temp};
                    }
                }
            }

            int num = mat[i][index];

            if (i == 0 && i != mat.length - 1){
                if(num > mat[i + 1][index]){
                    return new int[]{i, index};
                }
            }else if (i == mat.length - 1 && i != 0){
                if (num > mat[i - 1][index]){
                    return new int[]{i, index};
                }
            }else if (i == mat.length - 1 && i == 0){
                return new int[]{i, index};
            }else {
                if ((num > mat[i - 1][index]) && (num > mat[i + 1][index])){
                    return new int[]{i, index};
                }
            }

        }

        return new int[]{0,0};
    }

    public static int findPeakLeftElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static int findPeakRightElement(int[] nums) {
        int answer = -1;

        for (int i = 0; i < nums.length / 2; i++) {
            if (i + 1 == nums.length - 1){
                break;
            }
            if (i == 0){
                if (nums[i] > nums[i + 1]){
                    return i;
                }
            }else {
                if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]){
                    return i;
                }
            }
        }

        return answer;
    }


}
