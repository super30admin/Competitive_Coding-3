// Time complexity - O(n^2)
// Space complexity - O(n)

// Brute force appraoch

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1; j< nums.length; j++){
                int diff = Math.abs(nums[i] - nums[j]);
                if(diff == k && nums[i] < nums[j]){
                    List<Integer> li = Arrays.asList(nums[i],nums[j]);
                    set.add(li);
                }else if(diff == k && nums[i] >= nums[j]){
                    List<Integer> li = Arrays.asList(nums[j],nums[i]);
                    set.add(li);
                }
            }
        }
        
        return set.size();
    }
}
