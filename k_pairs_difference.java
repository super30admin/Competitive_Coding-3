// Time Complexity :O(N)
// Space Complexity :O(N) //hashmap
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public int findPairs(int[] nums, int k) {

    if(nums == null || nums.length == 0) return 0;
    int count = 0;
    int n = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    //we store the element along with it's count
    for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        else{
            map.put(nums[i], 1);
        }
    }
    for(int key : map.keySet()){
        //if k is 0, then we have to handle the case of duplicate elements as 1-1=0 or 2-2=0
        if(k == 0){
            if(map.get(key) >= 2)
            count++;
        }
        //we add the current element to k and check if the new element is present in the hashmap
        else{
            if(map.containsKey(key + k)){
                count++;
            }
        }
    }
    return count;
}