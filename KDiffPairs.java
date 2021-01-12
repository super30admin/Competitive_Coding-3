//Problem : 44 - K unique diff Pairs in an Array
// Time Complexity : O(n), n stands for number of elements
// Space Complexity : O(n),--> for hash map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
BruteForce: 
TC: O(n^2), SC:O(1)- Compare each element with remaining other elements and check whether the difference is equal to k or not

Optimal : 
          1) Hashing : TC: O(n), SC:O(n) - Insert all elements in hash map with their frequency. Iterate over the hashmap and if k>0 find if (element-k) exists in the map or not. If it exists increase the counter. If k==0, then just check whether frequency of element is greater than 1 or not. If it is greater than 1 then just update the counter.

          2) Two Pointer:TC(nLogn+O(n))=> O(nlogn), SC:O(1). As their can be duplicates and only uinique pairs are required, sort the array first. Keep two pointers, one is slow & other one is fast at index =0. Iterate over the array till slow pointer is less than array length & fast pointer is also less than the array length.
          For Moving pointers follow 3 cases:
                    1) If slow pointer is equal to the fast pointer or difference between the elements at fast and slow is less than k, then just increase the fast pointer.
                    2) If difference is greater than k, then just increase the slow pointer, so that difference window can be smaller
                    3) if difference is equal to k then just increment both slow and fast pointers. Make sure that current element at fast pointer is not equal to the previous element, so just increment the fast pointer until they are same.

Note: Ask interviewer whether the input arrays is sorted or not. If it is sorted just implement two pointers, SC will be O(1). Ask whether there will be duplicates and also ask 'k' can be equal to zero or not and proceed accordingly 
*/

import java.util.*;
class Solution44 {
    public int findPairs(int[] nums, int k) {
        
        if(nums==null || nums.length==0){
            return 0;
        }
        
        //TC: O(n), SC: O(n)
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int count =0;
        for(int key:map.keySet()){
            if(k==0){//check for k
                if(map.get(key)>1) count++;
            }else{
                int compliment = key-k;
                if(map.containsKey(compliment)){
                   count++;    
                }    
            }
            
        }
        return count;
        
        /* Two Pointers*/
        //TC: O(nlogn), SC: O(1)
        /*Arrays.sort(nums);
        int slow=0;
        int fast=0;
        int count =0;
        
        while(slow<nums.length && fast<nums.length){
            
            int diff = nums[fast]-nums[slow];
            //case1
            if(slow==fast || diff<k){
                fast++;
            }else if(diff>k){//case2
                slow++;
            }else{//case3-> diff==k
                count++;
                slow++;
                fast++;
                
                //there will be duplicates, so for ignoring duplicates when we found the matching difference
                while(fast<nums.length && nums[fast]==nums[fast-1]) fast++; 
            }
         
        }
        
        return count;*/
        
        
    }
}