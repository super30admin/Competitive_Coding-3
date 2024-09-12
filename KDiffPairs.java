/*
time complexity : O(n), n is the number of elements
space complexity :O(1)
*/
class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        
        //sort the array and then use 2 pointers to solve        
        //ex: 3,1,4,1,5
       Arrays.sort(nums);
        int count = 0;
        
        //1,1,3,4,5 , //k=2
             
        int low = 0;
        int high = 0;
        
        while(low < nums.length && high < nums.length){          
            int diff = Math.abs(nums[low] - nums[high]);
            
            if(low == high || diff < k){
                high++;
            }
            else if(diff > k){
                low++;
            }
            else{
                 count++;
                 low++;
                 high++;       
                while(high < nums.length && nums[high] == nums[high-1] ) high++;       
          }
        }
        
        return count;
    }
}