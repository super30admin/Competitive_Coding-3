// Time Complexity :O(n) since we got through the array twice(one for hashmap,other to traverse if complement is present)
// Space Complexity :O(n) where n is the number of entries in the hashmap
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// q532

class Solution {
    public int findPairs(int[] nums, int k) {
        // if k<0 then it should return 0 as the diff is absolute diff
        if (nums == null || nums.length == 0 || k < 0)
            return 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int count = 0;

        // create the hash map to keep count of each integer.
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        // if k!=0 continue normally
        if (k != 0) {

            for (int i : nums) {
                // if the complement is present we remove that from hm so that duplicate pair is
                // not counted again
                // let us say k=2 so (1,3) are counted twice so we will remove 3..
                // doing this will not cause prob because everytime we search i+k is there or
                // not
                // which basically means removing 3 will not hamper searching 5 in case of 3+2
                if (hm.containsKey(i + k)) {
                    if (k != 0)
                        count++;
                    hm.remove(i + k);
                }

            }
        } else {
            // if k=0 that means we have to count the number of duplicates
            for (int n : hm.keySet()) {
                // for duplicates, count>=2
                if (hm.get(n) >= 2)
                    count++;
            }
        }

        return count;
    }
}