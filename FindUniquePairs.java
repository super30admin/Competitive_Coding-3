/*
 *  Time Complexity: O(N) Where N is the size of  nums array.
 *  Space Complexity: O(N) Where N is the size of nums array.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *
 *  Explanation: We place all the element in a hash set. We then traverse throught all the elements in the nums array and check if an element with nums[i]+k or nums[i]-k exists in the hash set, is so we add it to our result pair. We then remove that nums[i] from hash set to remove duplicates. We repeat this till the last element in the array.
 */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int nums[]=new int[]{-1,0,1,-2,2,3,-3};
        findUniquePairs(nums, 1);
     }
     
     private static void findUniquePairs(int[] nums, int k){
         if(nums==null || nums.length==0 ) return;
         Set<Integer> set = new HashSet<>();
         
         for(int num: nums){
             set.add(num);
         }
         
         for(int i=0;i<nums.length;i++){
             if(!set.contains(nums[i])) continue;
             
             if(set.contains(k+nums[i])){
                 System.out.println("Found: "+ nums[i] + ":"+(nums[i]+k));
             }
             if(set.contains(nums[i]-k)){
                 System.out.println("Found: "+ nums[i] + ":"+(nums[i]-k));
             }
             set.remove(nums[i]);
         }
     }
}
