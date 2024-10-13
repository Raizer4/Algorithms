package practice.leetcode.hash_table.easy;

// Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/


import java.util.Set;
import java.util.TreeSet;

public class Leetcode_1832 {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new TreeSet<>();

        for (char temp : sentence.toCharArray()){
            set.add(temp);
        }

        return set.size() == 26;
    }

}
