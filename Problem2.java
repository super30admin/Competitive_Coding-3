// Time Complexity :o(N*2)+O(N*logN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
//Method1:Brute Force Approach
class Solution {
    public int findPairs(int[] nums, int k) {
        //TC:(O(N*2)+O(N*logN))
        //Sc:O(1)
         if(nums==null||nums.length==0) return 0;
         Arrays.sort(nums);
         int count=0;
         for(int i=0;i<nums.length-1;i++){
             int ptr1=i,ptr2=nums.length-1;
             //==k
             if(i!=0&&nums[i]==nums[i-1]) continue;
             if(Math.abs(nums[ptr1]-nums[ptr2])<k) break;
             while(ptr1<ptr2){
             if(Math.abs(nums[ptr1]-nums[ptr2])==k) {
             count++;
             break;
              }
             //>k
             else if(Math.abs(nums[ptr1]-nums[ptr2])>k) ptr2--;
             //<k
             else break;
             }

         }
         return count;


    }
}

//Method2:Using Hash Map
// Time Complexity :o(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                if(map.containsKey(k+nums[i]))count++;
                if(map.containsKey(nums[i]-k)) count++;
            }
            else    if(k==0){
                if(map.get(nums[i])==1)count++;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
