// Approach:
// 1. Store the frequency of each element using a HashMap.
// 2. If k == 0, count the elements whose frequency is at least 2.
// 3. Otherwise, iterate through the unique keys and check if (key + k) exists in the map.
// 4. Return the total count of valid k-diff pairs.

// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==0){
            for(int freq:map.values()){
                if(freq>=2){
                    cnt++;
                }
            }
        }else{
            for(int key:map.keySet()){
                if(map.containsKey(key-k)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
