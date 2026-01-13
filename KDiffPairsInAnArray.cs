//Time Complexity : O(n)
//Space Complexity : O(n)

//Approach
// Maintain Dictionary with keys and elements from the array , values as frequency
// Iterate over keys and check sum = Key + K ,if dictionary contains that sum then count it as one pair 
// If K is 0 then make sure frequency is greater than 1 then count.
public class Solution
{
    public int FindPairs(int[] nums, int k)
    {
        int count = 0;
        Dictionary<int, int> pair = new();
        for (int i = 0; i < nums.Length; i++)
        {
            if (!pair.ContainsKey(nums[i]))
            {
                pair.TryAdd(nums[i], 1);
            }
            else
            {
                pair[nums[i]]++;
            }
        }
        foreach (var key in pair.Keys)
        {
            int sum = key + k;
            if (k == 0)
            {
                int val = pair[key];
                if (val > 1)
                {
                    count++;
                }

            }
            else if (pair.ContainsKey(sum))
            {
                count++;
            }
        }
        return count;
    }
}


