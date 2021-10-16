class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int count = 0;
        unordered_map<int, int> m;
        
        for( auto ele : nums){
            m[ele]++;
        }
        
        
        for( auto it : m){
            if(m.find(it.first + k) != m.end()){
                if( k==0){
                    if (it.second >1)
                    count++;
                } else{
                    count ++;
                }
            }
            
        }
        return count;
    }
};

// Time Complexity: o(n) where n is the number of elements in nums array.
// Space Complexity: o(n)
