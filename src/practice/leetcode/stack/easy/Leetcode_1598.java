package practice.leetcode.stack.easy;

// Crawler Log Folder
// https://leetcode.com/problems/crawler-log-folder/description/


import java.util.Stack;

public class Leetcode_1598 {

    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../", "d21/","./"}));
    }

    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String temp : logs){
            if (temp.equals("../")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else if (temp.equals("./")){

            }else {
                stack.add(temp);
            }
        }


        return stack.size();
    }

}
