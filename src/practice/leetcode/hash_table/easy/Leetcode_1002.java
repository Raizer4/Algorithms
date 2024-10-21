package practice.leetcode.hash_table.easy;

// Find Common Characters
// https://leetcode.com/problems/find-common-characters/description/


import java.util.*;

public class Leetcode_1002 {

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
    }

    public static List<String> commonChars(String[] words) {
        HashMap<Character, Integer> result = new HashMap();

        fillMap(result,words[0]);

        List<Character> removeList = new ArrayList<>();

        for (int i = 1; i < words.length; i++){
            HashMap<Character, Integer> tempMap = new HashMap<>();
            fillMap(tempMap,words[i]);

            for (Map.Entry entry : result.entrySet()){
                if (!tempMap.containsKey((Character) entry.getKey())){
                    removeList.add((Character) entry.getKey());
                }else if (tempMap.get((Character) entry.getKey()) != entry.getValue()){
                    result.put((Character) entry.getKey(),Math.min((Integer) entry.getValue(),tempMap.get((Character) entry.getKey())));
                }
            }

        }

        for (Character character : removeList){
            result.remove(character);
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry entry : result.entrySet()){
            String key = String.valueOf((Character)entry.getKey());

            for (int i = 0; i < (Integer)entry.getValue(); i++){
                list.add(key);
            }

        }


        return list;

    }


    private static void fillMap(HashMap<Character,Integer> map, String str){
        for (Character temp : str.toCharArray()){
            int i = map.getOrDefault(temp, 0) + 1;

            map.put(temp,i);
        }
    }

}
