/**
 * Time Complexity : O(n) where n = size of nums array
 * Space Complexity : O(n)
 */

import java.util.HashMap;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0 || k<0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int value=0;
        for(int i=0;i<nums.length;i++){
            value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }
        int count=0;
        for(int i:map.keySet()){
            if(k==0){
                if(map.get(i+k)>1)
                    count++;
            }
            else{
                if(map.containsKey(i+k)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        KDiffPairs obj = new KDiffPairs();
        int[] myArr = new int[]{3,1,4,1,5};
        int k = 2;
        System.out.println(obj.findPairs(myArr, k));
        
    }
}