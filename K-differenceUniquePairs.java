class Solution {
    public int findPairs(int[] nums, int k) {
        //edge case
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        //Sorting the array
        Arrays.sort(nums);
        
        // intitaializing count, low and high accordingly
        int count = 0;
        int low  = 0;
        int high = 1;
        
        //Iterating through the array
        //calculate the diff
        //if the differrence is less than k or if high and low pointers are at same index, move high pointer
        //else if the difference is greater than k increment lo pointer
        //if the value is equal to target k, increment counter, low pointer 
        while(low < nums.length && high < nums.length){
            int diff = Math.abs(nums[high] - nums[low]);
            
            if(low >= high || diff < k){
                high++;
            }else if(diff > k){
                low++;
            }else{
                count++;
                low++;
                //to avoid duplicates, move low pointer until an new value is invoked
                while(low < nums.length && nums[low-1] == nums[low]){
                    low++;
                }
            }
        }
        //return counter
        return count;
    }
}

// Time Complexity:O(n log(n))
// Space Complexity: O(1)