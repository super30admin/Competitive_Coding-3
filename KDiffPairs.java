//Time Complexity:O(n)
//Space Complexity:O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        int count=0;
        for(int i =0;i<nums.length;i++){
            Map.put(nums[i],Map.getOrDefault(nums[i],0)+1);
        }
        for(int num:Map.keySet()){
            if (k>0 && Map.containsKey(num+k)){
                count++;
            }else if(k==0 && Map.get(num)>1 ){
                count ++;
            }
            }
        return count;   
        
        }

}