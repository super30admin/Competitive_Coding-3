//Time Complexity = O(N)
//Space Complexity = O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> values = new HashMap<>();
        //putting elements in the hashmap
        for(int i =0;i<nums.length ;i++){
            values.put(nums[i], values.getOrDefault(nums[i], 0)+1);
        }
        //base case

        //normal case
        int pairs =0;
        for(int value: values.keySet()){
            if((k==0 && values.get(value)>1))pairs +=1;
            else if(k>0 && values.containsKey(value + k)) pairs +=1;
        }
        return pairs;
    }
}
