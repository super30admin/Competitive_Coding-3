# Competitive_Coding-3

Please submit the interview problems posted in slack channel here. The problems and statements are intentionally not shown here so that students are not able to see them in advance 



class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int complement=target-nums[i];
        if(map.containsKey(complement))
        {
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
}

Time Complexity:O(n)
Space Complexity:O(n)