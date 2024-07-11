public class kDiffPairs
	{
        // Time Complexity : O(n)
        // Space Complexity : O(n)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public int FindPairs(int[] nums, int k)
        {
            if (nums == null || nums.Length == 0) return 0;
            int n = nums.Length;
            int result = 0;

            Dictionary<int, int> map = new Dictionary<int, int>();
            
            for(int i = 0; i < n; i++)
            {
                if (map.ContainsKey(nums[i]))
                    map[nums[i]]++;
                else
                    map.Add(nums[i], 1);
            }

            foreach (var item in map)
            {
                if (k > 0 && map.ContainsKey(item.Key + k))
                    result++;
                else if (k == 0 && item.Value > 1)
                    result++;
            }
            return result;
        }
    }
