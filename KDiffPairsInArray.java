import java.util.Arrays;

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
class KDiffPairsInArray{
	public int findPairs(int[] nums, int k) {
		//null case
        if(nums==null || nums.length==0 ||nums.length==1) return 0;
        
        //sort the array to apply Two pointers
        Arrays.sort(nums);    
        
        int count=0;
        int low=0;
        int high=1;
        
        while(low<=high && high<nums.length){       
            if(low==high){
                high++;
                continue;
            }           
            int diff= nums[high]- nums[low];            
            if(diff==k){
                count++;
                low++;
                high++;                
                //Remove duplicacy
                while(high<nums.length && nums[high] == nums[high-1]){
                    high++;
                }
            }else if (diff<k){
                high++;
            }else{
                low++;
            }
        }
        
        return count;
    }
	
	//Driver Code
	public static void main(String[] args) {
		KDiffPairsInArray ob = new KDiffPairsInArray();
		int[] nums= {3,1,4,1,5};
		int k= 2;
		System.out.println("Number of pairs in array with elements of "+k+" difference: "+ ob.findPairs(nums,k));
	}
}