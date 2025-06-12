// TC O(nlogn)
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int result =0;
        Arrays.sort(nums); // nlogn
        int p1 = 0;
        int p2 = 1;
        while(p1<n-1 &&p2 <=n-1){ //O(n)
            if(p1!=p2 && nums[p2]-nums[p1] == k){
                result++;
                p1++;
                while(p1<n && nums[p1] == nums[p1-1]){
                    p1++;
                }
            }else if(nums[p2]-nums[p1] <= k){
                p2++;
            }else{
                p1++;
            }
        }
        return result;
    }
}