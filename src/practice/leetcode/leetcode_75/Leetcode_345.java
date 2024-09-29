package practice.leetcode.leetcode_75;

// Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Leetcode_345 {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        List<Character> characterList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();


        for (int i = s.length() -1; i >= 0; i--){
            if (list.contains(Character.toLowerCase(s.charAt(i)))){
                characterList.add(s.charAt(i));
            }
        }

        int k = 0;

        for (int i = 0; i < s.length(); i++){
            if (list.contains(Character.toLowerCase(s.charAt(i)))){
                builder.append(characterList.get(k));
                k++;
            }else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

}
