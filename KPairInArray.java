// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class KPairInArray
{
    public int findPairs(int[] nums, int k)
    {
        int ans = 0;
        Arrays.sort(nums);

        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int start = i + 1, end = n-1;
            int target = k + nums[i];
            if(i != 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            if(binarySearch(nums, start, end, target))
            {
                ans++;
            }
        }
        return ans;
    }

    boolean binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return true;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was not present
        return false;
    }
}
