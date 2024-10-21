package practice.leetcode.design.easy;

// Design Parking System
// https://leetcode.com/problems/design-parking-system/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1603 {

    static class ParkingSystem {
        int bigSize;
        int mediumSize;
        int smallSize;

        List<Integer> big = new ArrayList<>();
        List<Integer> medium = new ArrayList<>();
        List<Integer> small = new ArrayList<>();

        public ParkingSystem(int small, int medium, int big) {
            this.bigSize = big;
            this.mediumSize = medium;
            this.smallSize = small;
        }

        public boolean addCar(int carType) {

            if (carType == 3){
                if (big.size() < bigSize){
                    big.add(3);
                    return true;
                }else {
                    return false;
                }
            }else if (carType == 2){
                if (medium.size() < mediumSize){
                    medium.add(2);
                    return true;
                }else {
                    return false;
                }
            }else{
                if (small.size() < smallSize){
                    small.add(1);
                    return true;
                }else {
                    return false;
                }
            }

        }

    }

    public static void main(String[] args)
    {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);

        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }



}
