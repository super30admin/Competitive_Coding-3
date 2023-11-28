// TC: O(n)
//Sc: O(n)

class Solution {

    // Hash function  
struct hashFunction 
{ 
  size_t operator()(const pair<int ,  
                    int> &x) const
  { 
    return x.first ^ x.second; 
  } 
};

public:
    int findPairs(vector<int>& nums, int k) {

        unordered_map<int, int> map;
         unordered_set<pair<int, int>,hashFunction> result;

        //store the indexes in the hash map
        for(int i = 0; i<nums.size(); i++ )
        {
            map.insert(pair<int,int>(nums[i],i));
        }

        //check for difference
        
        for(int j = 0; j<nums.size(); j++)
        {
            int temp = nums[j] - k;

            if(map.contains(temp) )
            {
                if(temp < nums[j])
                {                
                    pair<int, int> pair = make_pair(temp, nums[j]);
                    result.insert(pair);
                }
                else
                {                
                    pair<int, int> pair = make_pair(nums[j], temp);
                    result.insert(pair);
                }
            }
        }
        
        return result.size();
    }
};

