// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Have a map and feed all the values from the array into the map along with their occurences. Now, iterate the
map and check if the sum of key and k already exists in the map, if so, increment the count. If k is 0,
then we need to specially check if the value is greater than 1, it means, we can get k by the difference
of those multiple occurences of that element itself, so increment the count again.
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if(k > 0 &&map.containsKey(key + k))
                count++;
            else if(k == 0 && val > 1)
                count++;
        }
        return count;
    }
}