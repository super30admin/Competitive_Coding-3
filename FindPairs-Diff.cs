using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class FindPairs_Diff
    {
        /// Time Complexity : O(NLonN) 
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Referred Online
        public int FindPairs(int[] nums, int k)
        {
            if (nums == null || nums.Length == 0) return 0;
            Array.Sort(nums);
            int counter = 0;
            int fast = 0;
            int slow = 0;
            int n = nums.Length;
            while (slow < n && fast < n)
            {
                //case 1 (if diff is less than k increase fast)
                if (slow == fast || nums[fast] - nums[slow] < k)
                {
                    fast++;
                }

                //case 2 (diff greater than k , increase slow)
                else if (nums[fast] - nums[slow] > k)
                {
                    slow++;
                }

                //case 3 (if the diff is k , then increase counter)
                else
                {
                    counter++;
                    fast++;
                    slow++;
                    while (fast < n && nums[fast] == nums[fast - 1]) fast++;
                }
            }
            return counter;
        }

        //public int FindPairs(int[] nums, int k)
        //{
        //    if (nums == null || nums.Length == 0) return 0;
        //    int counter = 0;
        //    Dictionary<int, int> map = new Dictionary<int, int>();
        //    for (int i = 0; i <= nums.Length - 1; i++)
        //    {
        //        map.Add(nums[i], map.GetValueOrDefault(nums[i]) + 1);
        //    }

        //    foreach (var entry in map)
        //    {
        //        int x = entry.Key;
        //        int val = entry.Value;
        //        if (k > 0 && map.ContainsKey(x + k))
        //        {
        //            counter++;
        //        }
        //        else if (k == 0 && val > 1)
        //        {
        //            counter++;
        //        }
        //    }
        //    return counter;

        //}
    }
}
