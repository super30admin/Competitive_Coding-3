//Time complexity = O(N)
//Space complexity = O(N)

class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        //Corner Case when diff 0
        if(k==0){
            //set "count" to keep the count of all repeated values
            HashSet<Integer> count=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    count.add(nums[i]);
                }
                else set.add(nums[i]);
            }
            return count.size();
        }

        int count=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int temp:set){
            if(set.contains(temp+k)){
                count++;
            }
        }
        return count;
    }
}