// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//[3,1,4,1,5] k = 2
 public int FindPairs(int[] nums, int k) {

    int result = 0; 
    if(nums == null || nums.Length == 0)
        return result;

    HashSet<int> set = new HashSet<int>();
    
    for(int i = 0; i < nums.Length; i++)
    {
        set.Add(nums[i]);
    }

    for(int i = 0; i < nums.Length; i++)
    {
        int diff = Math.Abs(k - nums[i]);
        if(set.Contains(dif))
            result++;
    }
    return result;
 }