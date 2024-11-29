package practice.challenge.leetcode_75.decision.day_27.similar;

// Time Needed to Buy Tickets
// https://leetcode.com/problems/time-needed-to-buy-tickets/description/

public class Leetcode_2073 {

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2,3,2},2));
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1},0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != 0) {
                tickets[i]--;
                count++;
            }

            if (k == i && tickets[k] == 0) {
                return count;
            }

            if (i == tickets.length - 1) {
                i = -1;
            }
        }

        return -1;
    }

}
