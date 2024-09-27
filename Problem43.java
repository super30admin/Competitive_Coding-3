// Time Complexity : O(NlogN) _ O(N) ~ O(NlogN)
// Space Complexity : O(1)


// Approach:
// 	Sort the given array - O(nlogN)
// 	Take 2 pointers, i=0 & j =1; - O(logN)
// 	Loop through the array and compute the difference between nums[j]-nums[i] 
// 	if diff is less than k - increament j.
// 	if diff is greater than k - increament i.
// 	else increament the count & increament i such that nums[i] != nums[i-1]


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length<1) return 0;
        
        Arrays.sort(nums);
        int i =0;
        int j = 1;
        
        int count =0;
        
        while(i<nums.length && j<nums.length){
            if(i == j || nums[j]-nums[i]<k){
                j++;
            } else if(nums[j]-nums[i]>k){
                i++;
            } else{
                count++;
                int cur = i;
                while(i<nums.length && nums[cur] == nums[i]){
                    i++;
                }
            }
        }
        return count;
    }
}