// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: Here the basic approach is to find the number of k //difference pairs in the given array.For this intially we take the hashMap and map it to the number of its //repeating in the array. Then we will iterate over the map and find if key+k exists in the map and check if its //count >1(if k==0) then we increase the result by one for all non zero k we increase k by 1.

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int count =0;
        int temp=0;
        int result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
       for(int m:map.keySet()){   
            temp=m+k;
            if(map.containsKey(temp)){
                if(k==0 && map.get(temp)>1){
                     result++;  
                }
                else if(k!=0){
                    result++;
                }       
            }
            
        }
        return result;
        
    }
}