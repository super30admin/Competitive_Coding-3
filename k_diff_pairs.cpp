// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        
        set<int> nums_set;
        set<int>::iterator itr;
        map<int, int> nums_map;
        int small, large;
        int i;
        int len = nums.size();
        int num;
        
        // Zero Condition Handled Separately
        if(k == 0)
        {
            map<int, int> zero_map;
            map<int, int>::iterator iter;
            int count = 0;
            
            // Set value to 1 if duplicate found
            for(i = 0; i < len; i++)
            {
                if(zero_map.find(nums[i]) != zero_map.end())
                    zero_map[nums[i]] = 1;
                else
                    zero_map.insert(pair<int, int>(nums[i], 0));
            }
            
            //Increment counter if value is 1
            for(iter = zero_map.begin(); iter != zero_map.end(); iter++)
                if(iter->second > 0)
                    count++;
            
            return count;
        }
        
        //Normal Condition

        // Traverse and Add in set
        for(i = 0; i < len; i++)
        {
            nums_set.insert(nums[i]);
        }
        
        // Iterate through the set and find the matching k-diff pairs
        for(itr = nums_set.begin(); itr != nums_set.end(); itr++)
        {
            num = *itr;
            // x - num = k condition
            if((num != k + num) && nums_set.find(k + num) != nums_set.end())
            {
                // Add in a specifc order in map
                if(num < k+num)
                {
                    small = num;
                    large = k + num;
                }
                else
                {
                    small = k + num;
                    large = num;
                }
                nums_map.insert(pair<int, int>(small, large));
            }
            
            // num - x = k condition
            if((num != num - k) && nums_set.find(num - k) != nums_set.end())
            {
                // Add in a specific order in map
                if(num < num - k)
                {
                    small = num;
                    large = num - k;
                }
                else
                {
                    small = num - k;
                    large = num;
                }
                nums_map.insert(pair<int, int>(small, large));
            }
        }

        // Map will have all the unique pairs      
        return nums_map.size();
    }
};