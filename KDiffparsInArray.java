//https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
// Time complexity :o(nlogn)
// space complexity : o(1)
// Approach : sort the array and using left and right pointers we can keep count of k-diff unique pairs
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int slow =0;
        int fast =0;
        int count =0;
        while(slow < n && fast <n){
            int diff = nums[fast]-nums[slow];
            // case 1: diff < k ; increment fast 
            if(slow == fast || diff < k){
                fast++;
            } else if (diff > k){
                slow++;
            } else{
                count++;
                slow++;
                fast++;
                // check for uniqueness
                while(fast<n && nums[fast]==nums[fast-1]){
                        fast++;
                }
            }
        }
        return count;
    }
}

// Approach : Create a map to store the frequency of nums. which will be useful when k=0 as you would need to count the num that has freq >1 (duplicates)
// In second pass go through the keys of the map and look for the compliment (key+k)
// Time :  O(n)
// Space : O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        // Edge case 
        if(k<0) return 0;
        int n = nums.length;
        int result=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i:map.keySet()){
            if(k>0 && map.containsKey(i+k) || k==0 && map.get(i)>1){
                result++;
            }
        }

        return result;

    }
}