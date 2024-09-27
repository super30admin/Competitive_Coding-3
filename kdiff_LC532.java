
 // Time Complexity :  O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int findPairs(int[] nums, int k) {
       
        
      HashMap<Integer,Integer> map =new HashMap<>();
        int count=0;
        //count the frequency of each num using hashmap
        for( int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        
        //traverse through each pair and check if its complement pair exist in the map
        for(Map.Entry<Integer,Integer> pair: map.entrySet()){
            int x = pair.getKey();
            int val = pair.getValue();
            //if k>0 and map contains complement of x+k i.e y in  x+k = y ; 
            if(k>0 && map.containsKey(x+k)){
                count++;
            }
            //if k =0 in condition [1,1,1,1] then freq is >1 i.e atleast one pair of 1-1=0 , so by default increase counter by 1
            else if(k==0 && val>1){
                count++;
            }
        }
        return count;
    }
}