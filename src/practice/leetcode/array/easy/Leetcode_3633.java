package practice.leetcode.array.easy;

// Earliest Finish Time for Land and Water Rides I
// https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/description/

public class Leetcode_3633 {

    public static void main(String[] args) {
        System.out.println(earliestFinishTime(new int[]{2,8}, new int[]{4,1}, new int[]{6}, new int[]{3}));
        System.out.println(earliestFinishTime(new int[]{5}, new int[]{3}, new int[]{1}, new int[]{10}));
        System.out.println(earliestFinishTime(new int[]{99}, new int[]{59}, new int[]{99,54}, new int[]{85,20}));
    }

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int temp = (landStartTime[i] + landDuration[i]);

            for (int j = 0; j < waterStartTime.length; j++) {
                int count = temp;
                int num = waterStartTime[j] + waterDuration[j];

                if (landStartTime[i] >= num){
                    answer = Math.min(count, answer);
                    continue;
                }

                if (temp < waterStartTime[j]){
                    count += (waterStartTime[j] - temp);
                }

                count += waterDuration[j];

                answer = Math.min(count, answer);
            }
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            int temp = waterStartTime[i] + waterDuration[i];

            for (int j = 0; j < landStartTime.length; j++) {
                int count = temp;
                int num = (landStartTime[j] + landDuration[j]);

                if (num <= waterStartTime[i]){
                    answer = Math.min(answer, count);
                    continue;
                }

                if (landStartTime[j] > temp){
                    count += (landStartTime[j] - temp);
                }

                count += landDuration[j];

                answer = Math.min(count, answer);
            }

        }

        return answer;
    }



}
