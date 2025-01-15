public class Solution
{
    public int FindPairs(int[] nums, int k)
    {
        int count = 0;
        Dictionary<int, int> lookup = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            lookup.TryAdd(nums[i], 0);
            lookup[nums[i]]++;
        }

        foreach (var kv in lookup)
        {
            if (k > 0 && lookup.ContainsKey(kv.Key + k))
            {
                count++;
            }
            else if (k == 0 && kv.Value > 1)
            {
                count++;
            }
        }
        return count;
    }
}