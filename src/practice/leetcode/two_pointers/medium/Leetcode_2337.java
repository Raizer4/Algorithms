package practice.leetcode.two_pointers.medium;

// Move Pieces to Obtain a String
// https://leetcode.com/problems/move-pieces-to-obtain-a-string/description/

public class Leetcode_2337 {

    public static void main(String[] args) {
        System.out.println(canChange("_L", "LR"));
    }

    public static boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;

        while (i < start.length() || j < target.length()){
            while (i < start.length() && start.charAt(i) == '_'){
                i++;
            }

            while (j < target.length() && target.charAt(j) == '_'){
                j++;
            }

            if (j == target.length() && i == start.length()){
                return true;
            }else if (j == target.length()){
                return false;
            } else if (i == start.length()) {
                return false;
            }

            if (start.charAt(i) != target.charAt(j)){
                return false;
            }else
            {
                if (start.charAt(i) == 'R'){
                    if (i > j){
                        return false;
                    }
                }else {
                    if (i < j){
                        return false;
                    }
                }

            }

            i++;
            j++;
        }

        return true;
    }

}
