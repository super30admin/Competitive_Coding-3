class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        if(k==0){
            for(int i : hm.keySet()){
                if(hm.get(i)>=2)
                    count++;
            }
        }
        else{
            for(int i : hm.keySet()){
                if(hm.containsKey(i+k))
                    count++;
            }
        }
        return count;
    }
}

//Time complexity : O(nums.length)
//Space complexity : O(nums.length)
