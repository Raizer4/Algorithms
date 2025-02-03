package practice.leetcode.string.easy;

// Goal Parser Interpretation
// https://leetcode.com/problems/goal-parser-interpretation/description/

public class Leetcode_1678 {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) == ')' || command.charAt(i) == 'a' || command.charAt(i) == 'l'){
                continue;
            }


            if (command.charAt(i) == 'G'){
                builder.append("G");
            }else if (command.charAt(i + 1) == ')'){
                builder.append("o");
            }else {
                builder.append("al");
            }
        }

       return builder.toString();
    }

}
