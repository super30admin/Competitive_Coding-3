
//prob1: Pascal's triangle 2
// Time Complexity :O(k^2) where k is the num of rows in the pascal triangle
// Space Complexity : O(K) where k is the num of rows in the pascal triangle
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
/**
Three line comment: The less space effiecient solution is to fill in the arrayList with every row of the pascal triangle till the
given K and return kth row of the result list. To save the space, we can overwrite the result of the previous row in a single list and keep iterating for k^2 times.
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>();
        result.add(1); // adding the first row of the pascal triangle
        
        for(int i=1; i<= rowIndex; i++){
            for(int j=i-1; j>=1; j--){ // iterating from right to left
                int aboveRowSum = result.get(j) + result.get(j-1);
                result.set(j, aboveRowSum); // overwritting the result of the prev row
            }
            result.add(1); // one at the last index of the output row
        }
        
        return result;
    }
}

//prob2: k-diff 
// Time Complexity :O(nLogn) where n is the number of elements in the array nums
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
/**
Three line comment: Use the slow and fast pointer technique each element in the array. If the difference between the nums[slow] & nums[fast] is greater than k then the slow pointer
is moved to the right to get the bigger number to reduce the difference. Else fast pointer is incremented.
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int slow=0, fast = slow+1;
        int count = 0;
        
        while(slow < nums.length && fast < nums.length){
            
            int diff = nums[fast] - nums[slow];
            
            
            if(slow == fast || diff < k){ // slow == fast to avoid getting the wrong difference. example: K =0, slow=1, fast=1 [3,4]. The difference will be 3-3=0, which is not a pair. 
                fast++;
                
            }else if(slow == fast || diff > k){
                slow++;
                
            }else{
                count++;
                slow++;
                int curNumAtFast = nums[fast];
                while(fast < nums.length && nums[fast] == curNumAtFast) fast++; // avoiding duplicates
            }
            
        }
        
    return count;
        
    }
}
