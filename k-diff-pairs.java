// Time Complexity : O(N) where N is the length of nums
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

// I used a hashmap to store the indices of evry number from nums and then
// maintained a hashset to see if that has been counted towrads the pair
//  by checking the current number + k is there is in the hashset already


class Solution {
    public int findPairs(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        Map<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i],i);
        }


        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(k + nums[i]) &&
               !set.contains(k + nums[i]) && map.get(k+nums[i]) != i){
                    set.add(k + nums[i]);
                    count += 1;
            }

        }

        return count;
    }
}
