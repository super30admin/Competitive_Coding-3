/**
* Time complexity O(N)  where n is number of elements in the array
* Space Complexity O(N) creating HashMap
**/
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
        
           if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
           }
           else{
               map.put(nums[i],1);
           }

       }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            
            if(k>0 && map.containsKey(key+k)){
                count++;
            }
            else if(k==0 && val > 1){
                count++;
            }
        }
            
        return count;
    }
}
