//Time complexity : O(n)
//Space complexity : O(n)

//Approach :
            // Create a frequency hashmap of the given array
            // iterate through the hashmap and look for absolute difference between the two numbers
            // Increment result for each absolute difference found
            // Take care of the special case 0
            // Return the result

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.size() == 0)
            return 0;
        
        map<int,int> hm;
        
        for(int num : nums)
        {
            if(hm.find(num) == hm.end())
            {
                hm.insert(pair<int,int>(num, 0));
            }
            
            hm[num]++;
        }
        
        int result = 0;
        
        for(auto it = hm.begin(); it != hm.end(); it++)
        {
            int to_find = it->first + k;
            
            if(k > 0 && hm.find(to_find) != hm.end())
            {
                result++;
            }
            else if(k == 0 && hm.find(to_find) != hm.end() && hm[to_find] > 1)
            {
                result++;
            }
        }
        
        return result;
    }
};