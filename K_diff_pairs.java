// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Arrays;

public class K_diff_pairs {
	 public int findPairs(int[] nums, int k) {
	        if(nums.length<2) return 0;
	       Arrays.sort(nums);
	       int i=0;
	       int j=1;
	       int result=0;
	        int zeroSum=0;
	       while(j<nums.length){
	           boolean isSame=false;
	           while(j<nums.length && nums[j-1]==nums[j]){
	              isSame=true;
	               j++;
	           }
	           if(isSame){
	               zeroSum++;
	               continue;
	           }
	           if(k!=0){
	              if(nums[j]-nums[i]==k){
	                  result++;
	                  i++;
	                  j++;
	              }else if((nums[j]-nums[i])>k){
	                  i++;
	              }else{
	                  j++;
	              }
	           }else{
	               i++;
	               j++;
	           }
	            
	       }
	        return k==0?zeroSum:result;
	 }
}
