// Time Complexity : O(n) n:ArrayLength
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//First traversing through the array and inserting all the elemnts as key in HashMap and value as their count.
//Now traversing through the hashmap and checking if there is any element present as k+ele which means checking if there are any elements with difference of k and incrementing the count if we find it, then returning count.


class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int count = 0;
 			for (int i : nums)
 				map.put(i, map.getOrDefault(i, 0) + 1);
 			for (int i : map.keySet())
 				if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
 					count++;
 			return count;  
    }
}
