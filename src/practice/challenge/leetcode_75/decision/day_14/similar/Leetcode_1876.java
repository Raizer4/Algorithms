package practice.challenge.leetcode_75.decision.day_14.similar;

// Substrings of Size Three with Distinct Characters
// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1876 {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        if (s.length() < 3){
            return 0;
        }

        int i = 0;
        int k = 3;

        int count = 0;

        while (k <= s.length()){
            if (unicode(s.substring(i,k))){
                count++;
            }
            k++;
            i++;
        }

        return count;
    }

    private static boolean unicode(String string){
        List<Character> characterList = new ArrayList<>();

        for (char temp : string.toCharArray()){
            if (characterList.contains(temp)){
                return false;
            }else {
                characterList.add(temp);
            }
        }

        return true;
    }

}
