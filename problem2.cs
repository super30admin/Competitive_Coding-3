using System;
using System.Collections.Generic;
using System.Linq;

public class Solution
{
    public int FindPairs(int[] nums, int k)
    {
        var map = new Dictionary<int, int>();
        var result = new HashSet<string>();

        for (int i = 0; i < nums.Length; i++)
        {
            map[nums[i]] = i;
        }

        for (int i = 0; i < nums.Length; i++)
        {
            int complement = nums[i] - k;
            if (map.ContainsKey(complement) && map[complement] != i)
            {
                var pair = new int[] { nums[i], complement };
                Array.Sort(pair);
                result.Add($"{pair[0]},{pair[1]}");
            }

            complement = nums[i] + k;
            if (map.ContainsKey(complement) && map[complement] != i)
            {
                var pair = new int[] { nums[i], complement };
                Array.Sort(pair);
                result.Add($"{pair[0]},{pair[1]}");
            }
        }

        return result.Count;
    }
}
