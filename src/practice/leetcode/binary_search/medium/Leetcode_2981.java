package practice.leetcode.binary_search.medium;

// Find Longest Special Substring That Occurs Thrice I
// https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i/description/

import java.util.HashMap;


public class Leetcode_2981 {

    public static void main(String[] args) {
        System.out.println(maximumLength("abcaba"));
    }

    public static int maximumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int l = 1;
        int r = s.length();

        int answer = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                int j = i + 1;
                int num = 1;

                while (j < s.length() && s.charAt(j) == temp){
                    num++;
                    j++;
                    if (num >= m){
                        break;
                    }
                }

                if (num >= m){
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                }

            }

            boolean flag = false;

            for (Integer temp : map.values()){
                if (temp >= 3){
                    flag = true;
                    break;
                }
            }

            if (flag){
                answer = m;
                l = m + 1;
            }else {
                r = m - 1;
            }
            map.clear();
        }

        return answer;
    }

}
