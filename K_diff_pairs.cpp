class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        //declaring a key value pair
        
        unordered_map<int,int> hash_map ; 
        
        for(int i = 0 ;  i< nums.size() ; i++){
            
            hash_map[nums[i]]++;
        }
        
        // Case 1 when k = 0
        int count  = 0; 
        if(k == 0){
            for(auto x : hash_map){
                if(x.second > 1){
                    count++ ; 
                }
            }
        }
        
        // For k values > 0 
        if(k > 0){
            for(auto x : hash_map){
                if(hash_map.find(x.first + k) != hash_map.end()){
                    count++ ; 
                }
            }
        }
        
        return count ; 
    }
};
