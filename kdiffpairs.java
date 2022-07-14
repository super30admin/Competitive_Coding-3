// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach



class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(int i=0;i<nums.length;i++){
            int sum=nums[i]+k;
            if(map.containsKey(sum)){
                if(sum==nums[i]){
                    if(map.get(nums[i])>1){
                        count++;
                        //map.put(nums[i],map.get(nums[i])-1);
                        map.remove(nums[i]);
                    }
                }else{
                    count++;
                    map.remove(sum);
                    
                }
                
                
                
            }
        }
        
        return count;
    }
}