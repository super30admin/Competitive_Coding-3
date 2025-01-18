import java.util.HashMap;
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : YES, as per the interviewer i wasn't able to solve under less time.
public class Problem2 {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        if(nums == null || nums.length == 0){
            return 0;
        }
        //HashMap will contain key -> elements, value -> no of occurrence.
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hMap.put(nums[i],hMap.getOrDefault(nums[i],0)+1);
        }
        int count  = 0;
        //for each key check if the key - k is there and if the k is greater than 0 OR if k == 0 then the formula key -k will always be key, so there should be 2 element of same value then only we'll increase the count.
        for(int key : hMap.keySet()){
            if((hMap.containsKey(key-k) && k>0) || (k == 0 && hMap.get(key-k)>1)){
                count++;
            }
        }
        return count;
    }

    //TODO : Please IGNORE
    // HashSet<Integer> hSet = new HashSet<>();
    // for(int i = 0;i<nums.length;i++){
    //     hSet.add(nums[i]);
    // }
    // int count  = 0;
    // Iterator value = hSet.iterator();

    // while(value.hasNext()){
    //     if(hSet.contains(Math.abs(((Integer) value.next() - k)))){
    //         count++;
    //     }
    // }
}
