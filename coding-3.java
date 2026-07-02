// Approach:
// 1. Store the frequency of each element in a HashMap.
// 2. If k == 0, count the numbers whose frequency is at least 2,
//    since a pair requires duplicate elements.
// 3. If k > 0, iterate through all unique keys in the map.
// 4. For each key, check whether (key - k) exists in the map.
// 5. If it exists, increment the count as it forms a unique k-diff pair.
// 6. Return the total count of unique pairs.

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
