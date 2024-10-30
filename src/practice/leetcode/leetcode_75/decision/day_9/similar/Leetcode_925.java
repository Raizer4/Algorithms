package practice.leetcode.leetcode_75.decision.day_9.similar;

// Long Pressed Name
// https://leetcode.com/problems/long-pressed-name/description/

public class Leetcode_925 {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex","aaleex"));
        System.out.println(isLongPressedName("saeed","ssaaedd"));
        System.out.println(isLongPressedName("alex","aaleexa"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int index = 0;
        int i = 0;

        while (index < name.length() && i < typed.length()){
            if (name.charAt(index) == typed.charAt(i)){
                index++;
                i++;
            }else if (index > 0 && name.charAt(index - 1) == typed.charAt(i)){
                i++;
            }else {
                return false;
            }
        }

        if (typed.length() > i){
            String substring = typed.substring(i, typed.length());
            for (char temp : substring.toCharArray()){
                if (name.charAt(name.length() - 1) != temp){
                    return false;
                }
            }
        }

        return index == name.length();
    }

}
