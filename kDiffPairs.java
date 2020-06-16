import java.util.Arrays;
import java.util.HashMap;

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Approach(Using Two Pointers): Use the slow and fast pointer technique each element in the array. 
// If the difference between the nums[slow] & nums[fast] is greater than k then the slow pointer
// is moved to the right to get the bigger number to reduce the difference. Else fast pointer is incremented.

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        if(k<0) return 0;
        int slow=0, fast=slow+1;
        int count=0;
        while(slow<nums.length && fast<nums.length) {
            int diff = nums[fast]-nums[slow];
// slow == fast to avoid getting the wrong difference. example: k =0, slow=1, fast=1 [3,4]. The difference will be 3-3=0, which is not a pair. 
            if(slow==fast || diff<k) fast++;
            else if(slow==fast || diff>k) slow++;
            else {
                count++;
                slow++;
                int curr=nums[fast];
                while(fast<nums.length && curr==nums[fast]) fast++; // avoiding duplicates
            }
        }
        return count;
    }
}


// Time Complexity : O(n) n=size of nums array
// Space Complexity : O(n) n= size of HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach(Using HashMap): Take a HashMap to store the numbers in array along with the count of the numbers.
// Now iterate through the key set and check if the number in key + k is present in the map.
// If it is present then increment the count by 1. Return the count at the end.
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        if(nums==null || nums.length==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        //{3:1,1:2,4:1,5:1}
        for(int num:map.keySet()){
            if(k==0){
                if(map.get(num)>1) count++; //1
            }
            else{ //k=2
                if(map.containsKey(num+k)) count++; //1+1
            }
        }
        return count;
    }
}