// Time Complexity : O(n +nlogn) => O(N)asymptotically; where n is the length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// CODE

class k_different_pairs_inArray{
    public int findPairs(int[] nums, int k) {
        //null case
        if(nums== null || nums.length ==0) return 0;
        int count=0;
        Arrays.sort(nums);  //sorting array ->O(nlogn)
        //taking two pointers
        int low=0;
        int high =1;
         while(low<nums.length && high<nums.length){
             int diff = nums[high]-nums[low];  //claculating difference between both elements
             if(diff==k){  //if dieerence is equal to target then we will move both the pointers and increase the count by 1
                 low++;
                 high++;
                 count++;
                 while(high<nums.length && nums[high]==nums[high-1]){ //managing duplicate values 
                     high++;
                 }
             }else if(diff<k){  //if differnce is less than we will high pointer 
                 high++;
             }else{
                 low++;
                 if(high-low==0){    //when high and low both are at same index
                     high++;
                 }
             }
         }
        return count;
    }
}