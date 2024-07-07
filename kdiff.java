//Time Complexity:O(N)
//Space Complexity:O(N)
//In this problem, I'll first add each elements in the array to the hashmap, with the key being the element and the value being the count. Then , I'll loop through the keyset and check whether the count of a key is greater than or equal to 2 , if the k diff is 0. Else, I'll check if my key+k exists in the keyset. In that case, I'll increment my counter. I'll return 0 otherwise or when the array length is 0 or k is less than 0.
//This code was executed successfully and got accepted in leetcode. 


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0||k<0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>=2){
                    res++;
                }
            }
            else{
                if(map.containsKey(key+k)){
                    res++;
                }
            }
        }
        return res;
    }
}