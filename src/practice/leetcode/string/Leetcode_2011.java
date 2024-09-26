package practice.leetcode.string;

// Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class Leetcode_2011 {

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for (String temp : operations){
            if (temp.contains("+")){
                count++;
            }else {
                count--;
            }
        }

        return count;
    }

}
