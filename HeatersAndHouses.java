/*
https://leetcode.com/problems/heaters/
475. Heaters - EASY
Did this code successfully run on Leetcode : Yes

Time Complexity : O(nlogn) + O(mlogn); m => no of houses, n => no of heaters
Space Complexity : O(1)
Approach : We want to heat every house in the array. 
For every house we need to find the nearest heater that can heat the house. 
To find the nearest heater will be quicker with binary search in the heater array. Thus, sort the heater array.
We can use binary search to find the nearest heater.
The final answer will be the maximum of all the minimum radius of all the heaters. 
This value will be the minimum radius, the heaters need to have to heat all the houses
*/

import java.util.Arrays;

public class HeatersAndHouses {
    public static void main(String args[]) {
        System.out.println(findRadius(new int[] {1,2,3}, new int[] {2}));
        System.out.println(findRadius(new int[] {1,2,3,4}, new int[] {1,4}));
    }

    public static int findRadius(int[] houses, int[] heaters) {
        if (houses == null || houses.length == 0) {
            return 0;
        }        
        
        // global max
        int max = Integer.MIN_VALUE;
        // sort heaters
        Arrays.sort(heaters); // TC: O(nlogn)
        // loop thru houses
        for (int i = 0; i < houses.length; i++) {
            // getMinRadiusForEachHouse
            int minRadius = getMinradiusForHouse(houses[i], heaters);
            // update global max with result of getMinValueForHouse
            max = Math.max(minRadius, max);
        }        
        // return global max
        return max;
    }
    
    // Binary search that returns the nearest element for a given value
    public static int getMinradiusForHouse(int house, int heaters[]) {
        int min = Integer.MAX_VALUE;
        int low = 0, high = heaters.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low)/2;
            if (heaters[mid] == house) {
                return 0;
            }
            if (heaters[mid] < house) {
                low++;
            } else if (heaters[mid] > house) {
                high--;
            }
            min = Math.min(Math.abs(heaters[mid] - house), min);
        }
        return min;
    }
}