// Time Complexity : O(n), n is size of array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0; 
        if(nums == null || nums.length == 0) return 0; 
        HashMap<Integer,Integer> map = new HashMap<>();  
        //use hashmap (key,value) = (number,no. of occurance) when k = 0, value should be >=2 
       
        //add numbers to array
        for(int i = 0; i < nums.length;  i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
                //increase value if number already present
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        //count = 0 at start
        int count = 0;
       
        // when k = 0
        if(k == 0){
            for(int i = 0; i < nums.length; i++){
                //check if number present and occurance > 1
                //if yes, increase count
                //make that value 0 in hashmap, to avoid duplication
                //as same number can occur at different i value
                if(map.containsKey(nums[i]) && map.get(nums[i]) > 1) {
                    count++; 
                    map.put(nums[i],0);
                }
            }
        }
        
        else {
            //for k > 0
            for(int i = 0; i < nums.length; i++){
                //1. if k = key - nums[i]
                if(map.containsKey(nums[i] + k)) {
                    //find if key is present and value >= 1 
                    //increase count
                    if((map.get(nums[i]) >= 1) && (map.get(nums[i] + k) >= 1)){
                        count++;
                    }
                }
                //2. k = nums[i] - key
                if(map.containsKey(nums[i] - k)) {
                    //find if key is present and value >= 1 
                    //increase count
                    if((map.get(nums[i] - k) >= 1) && (map.get(nums[i]) >= 1)){
                        count++;
                    }
                }
                //replace in hashmap to avoid duplicates
                map.put(nums[i], 0);                             
            }          
        }
        //return count
        return count;           
        }
              
    }
