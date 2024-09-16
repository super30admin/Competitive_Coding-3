/**
O(N) time  
O(N) space
*/
class Solution {
    public int findPairs(int[] nums, int k) {

        if(nums == null || nums.length == 0)
            return 0;

        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        for(int key : map.keySet()) {
            if(k != 0) {
                int searchVal = key + k;
                if(map.containsKey(searchVal))
                    result++;
            }
            else if (k == 0) {
                if(map.get(key) > 1)
                    result++;
            }
        }
        return result;
    }
}
