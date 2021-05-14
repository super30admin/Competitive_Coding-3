class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            
            //check previous element is same as the current 
            while (i + 1 < nums.length && nums[i] == nums[i+1]) {
                continue;
            }
            int res = nums[i] - k;
            int res1 = nums[i] + k;
            
            //if contains
            if(set.contains(res) || set.contains(res1)){
                count++;
                set.add(nums[i]);
            }//if it does not conatin
            else{
                set.add(nums[i]);
            }
                
        }
        return count ;
    }
}
