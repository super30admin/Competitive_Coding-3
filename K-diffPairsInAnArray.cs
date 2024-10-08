// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class Solution {
    public int FindPairs(int[] nums, int k) {
        int n = nums.Length;
        Dictionary<int, int> map = new Dictionary<int, int>();
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                
                if(Math.Abs(nums[i] - nums[j]) == k){
                    int max = Math.Max(nums[i],nums[j]);
                    int min = Math.Min(nums[i],nums[j]);
                    if(!map.ContainsKey(min)){
                    map.Add(min, max);
                    count++;
                }

                }
                
            }
        }

        return count;
    }
}
