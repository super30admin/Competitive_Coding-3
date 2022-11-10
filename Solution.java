//Time complexity: O(N)
//Space complexity: O(1)
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(k > 0 && map.containsKey(key + k))
                result++;
            else if(k == 0 && value > 1)
                result++;
        }
        return result;
    }
}
