public class KDiffPair {
    // TC is O(nlogn)
    // SC is O(1)
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int target = nums[i]+k;
            int low = i+1;
            int high = n-1;
            int mid;
            while(low<=high){
                mid = low + (high-low)/2;
                if(nums[mid]==target)
                {
                    count++;
                    break;
                }
                else if(nums[mid]>target) high = mid-1;
                else low = mid+1;
                
            }
        }
        return count;
    }
}
