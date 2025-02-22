import java.util.HashMap;
import java.util.Map;

//Time Complexity functions: O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/*
We create a map of numbers and their frequency in given array. Then we iterate throught the keyset as it contains unique
numbers. We find key+k, if it exist we increase count. key-k is already taken case by earlier key +k so we avoid duplicate counting.
If the k==0 and frequency is more that 1 then we increase count by 1 for that.
*/
class KDiffPairInArray {
    public int findPairs(int[] arr, int k) {
        int count=0;
	Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
	for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int x=entry.getKey();
            int val=entry.getValue();
            if(k==0 && val>1){
                count++;
            }
            if(k>0 && map.containsKey(x+k)){
                count++;
            }
        }
        return count;
    }
}
