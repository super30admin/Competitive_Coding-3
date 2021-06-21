// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        //store the element with its frequency
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            int complement = i + k;
            //if k = 0, check for second occurence of the element 
            if(k == 0){
                if(map.get(i) > 1)
                    result++;
            }
            else if(map.containsKey(complement))
                result++;
        }
        return result;
    }
}