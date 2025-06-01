//TC : O(n) for traversing thru array,
//SC: O(n) for hashmap
// Leetcode: YES
// Struggled with intuition while gathering required output but solved

class Solution {
    public int findPairs(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        int count = 0;

        for (int key : map.keySet()) {
            if ((k > 0 && map.containsKey(key + k)) 
                || (k == 0 && map.get(key) > 1)) // must be atleast 2
                 count++;
        }
        
        return count;
    }
}