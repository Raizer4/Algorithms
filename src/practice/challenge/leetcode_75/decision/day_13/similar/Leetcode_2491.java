package practice.challenge.leetcode_75.decision.day_13.similar;

// Divide Players Into Teams of Equal Skill
// https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/description/


import java.util.Arrays;

public class Leetcode_2491 {

    public static void main(String[] args) {
        System.out.println(dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
        System.out.println(dividePlayers(new int[]{3,4}));
        System.out.println(dividePlayers(new int[]{1,1,2,3}));
    }

    public static long dividePlayers(int[] skill) {
        int i = 0;
        int j = skill.length - 1;

        Arrays.sort(skill);

        int t = skill[i] + skill[j];

        while (i < j){
            if (skill[i] + skill[j] != t){
                return -1;
            }
            i++;
            j--;
        }

        i = 0;
        j = skill.length - 1;

        long sum = 0;

        while (i < j){
            sum += skill[i] * skill[j];
            i++;
            j--;
        }

        return sum;
    }



}
