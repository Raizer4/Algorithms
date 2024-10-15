package practice.leetcode.hash_table.medium;

// Minimum Number of Pushes to Type Word II
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/description/

import java.util.*;

public class Leetcode_3016 {

    public static void main(String[] args) {
        System.out.println(minimumPushes("aabbccddeeffgghhiiiiii"));
        System.out.println(minimumPushes("xyzxyzxyzxyz"));
        System.out.println(minimumPushes("abcde"));
        System.out.println(minimumPushes("alporfmdqsbhncwyu"));
        System.out.println(minimumPushes("aremgjnptohswfdkyuzvicqxb"));
    }

    public static int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char temp : word.toCharArray()){
            int i = map.getOrDefault(temp, 0) + 1;
            map.put(temp,i);
        }

        Set<Character> keySet = map.keySet();
        Collection<Integer> values = map.values();


        int size = keySet.size();

        int count = 0;

        if (size > 8){
            int temp = size;
            int award = 0;

            while (temp >= 8){
                temp -= 8;
                award++;
            }

            while (!values.isEmpty()) {
                int res = 8 * award;

                if (award == 0){
                    break;
                }

                if (size != res) {
                    Integer min = Collections.min(values);
                    count += min * (award + 1);
                    size--;
                    values.remove(min);
                }else {
                    award--;
                }
            }

        }

        if (size <= 8){
            for (Integer temp : values){
                count +=  temp;
            }
        }


        return count;
    }

}
