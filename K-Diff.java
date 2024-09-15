// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//<---HashMap-->
class Solution {
    public int findPairs(int[] nums, int k) {
        //edge
        if( k < 0 nums.length == 0) return 0;
        //logic
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);        // add elements to map
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(k == 0) {
                if(entry.getValue() > 1) pairs++;    // if duplicates found and k == 0, increment count of pairs
            } 
            else {
                if(map.containsKey(entry.getKey()+k)) pairs++; // if value+k found in array, another pair found, increment count
            }
        }
        return pairs;
    }
}

<--TwoPointers-->
class Solution {
    public static int findPairs(int[] nums, int k) {
        //edge
        if(k<0 || nums.length == 0) return 0;
        //logic
        Arrays.sort(nums);
        int n = nums.length;
        int left=0;
        int right=0;
        int count=0;
        //Loop through the entire array length
        while(left<n && right<n){
            // to check is same value is repeated
            if(left != 0 && nums[left] == nums[left-1]){
                 continue;
            }
            //I got this once I thought it through again,
            //if both value are pointing to the same element then we move the right pointer to next element
            if(left==right){
               right++;
            } //target found, increment count, left and right pointer
            else if(nums[right] - nums[left] == k){
                count++;
                left++;
                while(left<n && nums[left] == nums[left-1]){
                    left++;
                }
                right++;
                while(right<n && nums[right] == nums[right-1]) right++;
            }else if(nums[right] -nums[left] > k){
                left++;
                while(left<n && nums[left] == nums[left-1]) left++;
            }else if(nums[right] -nums[left] < k){
                right++;
                while(right<n && nums[right] == nums[right-1]) right++;
            }
        }
        return count;
    }
}

<--BruteForce with HashSet-->

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {			
                set.add(nums[i]);
            }
            else {
                duplicates.add(nums[i]);			
            }
        }
        for(int n: set) {
            if(set.contains(n+k)) pairs++;			  
        }
        return k == 0? duplicates.size():pairs;
    }
}