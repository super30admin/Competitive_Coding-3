// Time Complexity : O(nlogn) //for sorting.
// Space Complexity : O(1) considering space used to sort the array is constant.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially struggled to come up with the solution for k==0.


// Your code here along with comments explaining your approach
//Two-pointer approach:

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return 0;
        Arrays.sort(nums);
        int l =0;
        int h = 1;
        int count = 0;
        while(l<nums.length&&h<nums.length){
            if(l==h||nums[h]-nums[l]<k)
                h++;
            else if(l<h && nums[h]-nums[l]>k){
                l++;
            }
            else{
                count++;
                l++;
                while(l<nums.length&&nums[l-1]==nums[l]){
                    l++;
                }
            }
        }
        return count;
    }
}

//Hashing Approach.
// Time Complexity : O(n) 
// Space Complexity : O(n) for storing the number of occurences of each element.
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int x = entry.getKey();
            int val = entry.getValue();
            if(k==0&&val>1)
                count++;
            else if(k>0){
                if(map.containsKey(x-k))
                    count++;
            }
        }
        return count;
    }
}