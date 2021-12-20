//Timecomplexity : O(nlogn)
//spacecomplexity : o(1)
//K-diff pairs
class Problem2 {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count=0;
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(i<nums.length && j <nums.length){
            if(i==j || nums[j]-nums[i]<k){
                j++;
            }else if(nums[j]-nums[i]>k){
                i++;
            }else{
                count++;
                i++;
                //skip duplicate
                while(i<nums.length && nums[i]==nums[i-1]){
                    i++;
                }
            }
        }
        return count;
    }
}