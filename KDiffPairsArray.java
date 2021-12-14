// Time Complexity : O(n)
// Space Complexity : O(n)

// using hashmap
public class KDiffPairsArray {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        // make the frequency map
        for(int n : nums)
        {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n)+1);           
        }
        
        // look for pairs
        for(int n : map.keySet())
        {
            int comp = n + k;
            if(map.containsKey(comp))
            {
                if(k == 0)
                {
                    if(map.get(comp) >= 2) // need atleast 2 occurence
                            count++;
                }
                else if(k > 0)
                {
                    count ++;
                }
            }
        }
        
        return count;
    }
}

// optimized map
public class KDiffPairsArray {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        // look for pairs
        for(int n : nums)
        {
            if(!map.containsKey(n)) // map is empty check for complement
            {
                if(map.containsKey(n + k))
                {
                    count++;
                }
                if (map.containsKey(n - k))
                {
                    count++;
                }
                map.put(n, 0);
            }
            // k == 0 comp should be n
            else
            {
                if(k == 0 && map.get(n) == 0)// will be added only once
                {
                    count++;
                }
                map.put(n, map.get(n)+1);
            }
        }
        return count;
    }
}

// Time Complexity: O(nlogn + n)
// Space Complexity: O(n)
public class KDiffPairsArray {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0, left = 0 , right = left+1;

        while(left < right  && right < nums.length)
        {
            int diff = nums[right] - nums[left];
            if(diff < k)
            {
                // avoid duplicate numbers to skip pairs
                while(++right < nums.length && nums[right-1] == nums[right]);
            }
            else
            {
                if(diff == k)
                    count++;
                // avoid duplicate numbers to skip pairs
                while(++left < nums.length && nums[left-1] == nums[left]);
                if(right <= left) // left can overtake right
                    right = left + 1;
            }
        }
        return count;
    }
}