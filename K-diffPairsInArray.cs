
// TimeCoplexity - O(n)
// SpaceComplexity - O(n)
public class Solution
{
    public int FindPairs(int[] nums, int k)
    {
        if (nums == null || nums.Length == 0)
        {
            return 0;
        }
        Dictionary<int, int> dict = new Dictionary<int, int>();
        int result = 0;
        // iterate through array to put unique elements and frequency in dictionary
        for (int i = 0; i < nums.Length; i++)
        {
            if (dict.ContainsKey(nums[i]))
            {
                dict[nums[i]] = dict[nums[i]] + 1;
            }
            else
            {
                dict.Add(nums[i], 1);
            }
        }
        // iterate through dict to get the pair
        foreach (var keyVal in dict)
        {
            int secondValue = keyVal.Key + k;
            if (dict.ContainsKey(secondValue))
            {
                // handle if k==0: if the frequency of the element is greater than 2 count a pair
                if (k == 0)
                {
                    if (dict[secondValue] >= 2)
                    {
                        result++;
                    }
                }
                else
                {
                    result++;
                }
            }
        }
        return result;
    }
}