//Time Complexity: O(N) where N is the length of nums array
//Space Complexity: O(N) (HashMap of size N can be created in worst case)

//Did it run on leetcode: Yes (Runtime: 7ms)

//Approach: We take a hashmap to initially store the frequencies of all the elements in nums array. Then we do a 
//pass on this hashmap to find two elements - key and key+k, if both exist in the hashmap, then we increment our 
//count by 1 else the pair with k difference does not exist. For k = 0, we need two same elements hence we 
//check the frequence in the hashmap for each element and if its more than 1, we increment our count.


import java.util.*;
class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }

        for(int key: hmap.keySet())
        {
            if(k == 0)
            {
                if(hmap.get(key) > 1)
                    count++;
            }
            else
            {
                if(hmap.containsKey(key+k))
                    count++;
            }
        }
        return count;
    }
}