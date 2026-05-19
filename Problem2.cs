// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I maintain a dictionary which holds the frequency of each element present in nums. I then iterate through the keys of the dictionary and obtain the frequency of the key. If k == 0 and frequency of the key
>1, I add 1 to the result. For other values of k, I check if the dictionary contains key + k, if so I increment result by 1.
*/

public class Solution {
    public int FindPairs(int[] nums, int k) {
        int result = 0;
        Dictionary<int, int> hashMap = new();
        for(int i = 0; i < nums.Length; i++)
        {
            hashMap[nums[i]] = hashMap.GetValueOrDefault(nums[i], 0) + 1;
        }

        foreach(int key in hashMap.Keys)
        {
            int frequency = hashMap[key];
            
            if(k==0)
            {
                if(frequency>1)
                {
                    result += 1;
                }
            }

            else
            {
                if(hashMap.ContainsKey(key + k))
                {
                    result += 1;
                }
            }
        }

        return result;
    }
}