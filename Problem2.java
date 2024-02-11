// https://leetcode.com/problems/k-diff-pairs-in-an-array/

// Time Complexity : Find below
// Space Complexity : Find below
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.HashSet;

class BruteForce {
    // Time - O(N^2)
    // Space - O(N^2)
    // Generate all possible pairs and check if their abs difference is k, count distinct pairs using a set
    public int findPairs(int[] nums, int k) {
        // Outout set
        Set<List<Integer>> result=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    // Pair found
                    List<Integer> res=Arrays.asList(nums[i], nums[j]);
                    Collections.sort(res);
                    result.add(res);
                }
            }
        }

        return result.size();
    }
}

class Optimized {
    // Time - O(N)
    // Space - O(N)
    // Optimize linear search from brute force using a hashmap
    // First pass - create a map of val to frequencies
    // Second pass - Iterate over map( to avoid duplicates), check if (element+k) exists in map, if yes we found a pair
    // Edge case: when k=0, every element will make a pair with itself, to avoid this and condition for k=0 and only count if freq>1
 

    public int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        // First Pass - O(n)
        for(int i=0;i<nums.length;i++){
            int freq=freqMap.getOrDefault(nums[i],0);
            freqMap.put(nums[i], freq+1);
        }

        // Second Pass. - O(n)
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            int val=entry.getKey();
            int freq=entry.getValue();

            // Check if val+k exists in map,  if yes we found a pair
            if(freqMap.containsKey(val+k)){
                int resFreq=freqMap.get(val+k);

                if(k!=0){
                    count++;
                }else if(k==0 && resFreq>1){
                    // Edge case for k=0
                    // A pair exists only if more than 1 occurences of current element are there
                    count++;
                }
            }
        }

        return count;
    }
}