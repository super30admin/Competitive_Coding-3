//Time Complexity O(n^2)
//Space Complexity O(n)
//Leetcode tested

import java.util.Arrays;
import java.util.HashSet;

public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        HashSet<Integer> hSet = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                int sum=nums[i]+k;
                int index=i+1;
                while (index<nums.length && sum>nums[index]){
                    index++;
                }
                if(index<nums.length && sum == nums[index]) count++;
                /*if(k==0 && nums[i]==nums[i+1]){
                    while (i< nums.length && nums[i]!=nums[i+1]) i++;
                    i--;
                }*/
            }else{
                if(k==0 && nums[i] == nums[i+1]){
                    hSet.add(nums[i]);
                    i++;
                }
            }
        }
        if(k==0) return hSet.size();

        return count;
    }
}
