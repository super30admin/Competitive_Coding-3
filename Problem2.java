package Competitive;

public class Problem2 {
	   public int findPairs(int[] nums, int k) {
	        if(nums==null || nums.length==0)
	            return 0;
	        
	        Arrays.sort(nums);
	        
	        int s=0;
	        int f=0,count=0;
	        
	        while(s<nums.length && f<nums.length){
	             if(s==f || nums[f]-nums[s]<k){
	                f++;
	            }
	            else if(nums[f]-nums[s]>k){
	                s++;
	            }else{
	                 count++;
	                f++;s++;
	                while(f< nums.length && nums[f]==nums[f-1]){
	                    f++;
	                }
	            }
	        }
	        
	        return count;
	    }
}
