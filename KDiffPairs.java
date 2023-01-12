// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We use a hashset to store the values so that we can check if we have come across either nums[i]-k or nums[i]+k previously
// We also use another hashset to track the pairs because we want to track unique pairs

class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> pairs = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-k) && !pairs.contains(Arrays.asList(nums[i],nums[i]-k)))
               { 
                    count++;
                    pairs.add(Arrays.asList(nums[i],nums[i]-k));
                    pairs.add(Arrays.asList(nums[i]-k, nums[i]));
               }
            if(set.contains(k+nums[i]) && !pairs.contains(Arrays.asList(nums[i],k+nums[i])))
                { 
                    count++;
                    pairs.add(Arrays.asList(nums[i],k+nums[i]));
                    pairs.add(Arrays.asList(k+nums[i], nums[i]));
               }
            set.add(nums[i]);
        }
        for(List<Integer> i : pairs)
            System.out.println(i);
        return count;
    }
}