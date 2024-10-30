package practice.leetcode.leetcode_75.decision.day_8.similar;

// Minimum Hours of Training to Win a Competition
// https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/description/

public class Leetcode_2383 {

    public static void main(String[] args) {
        System.out.println(minNumberOfHours(5,3,new int[]{1,4,3,2}, new int[]{2,6,3,1}));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int count = 0;
        int index = 0;

        while (index < energy.length){
            int energyEntity = energy[index];
            int experienceEntity = experience[index];

            if (initialEnergy > energyEntity && initialExperience > experienceEntity){
                index++;
                initialEnergy -= energyEntity;
                initialExperience += experienceEntity;
            }else if (initialEnergy <= energyEntity){
                initialEnergy++;
                count++;
            } else if (initialExperience <= experienceEntity) {
                initialExperience++;
                count++;
            }

        }

        return count;

    }

}
