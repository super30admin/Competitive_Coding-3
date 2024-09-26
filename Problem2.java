//Pairs with k Difference
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//hashmap approach



import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
        int k = 1;
        System.out.println(kdifference(nums, k));
    }
    public static int kdifference(int[] nums, int k){
        //[3,1,4,1,5] k = 2
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                if(map.containsKey(Math.abs(nums[i] -k)) || map.containsKey(Math.abs(nums[i] +k))){
                    count++;
                }
                
            }
            map.put(nums[i], i); ///3->0,  
        }
        return count;
    }
    
}