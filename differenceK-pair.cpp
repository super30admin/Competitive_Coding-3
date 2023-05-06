class Solution {
    // SC - O(n)
    //TC - O(n)
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map <int,int> umap;
        int count =0;
        for(int i=0; i< nums.size();i++){
            if(umap.find(nums[i]) == umap.end() ){
                umap[nums[i]] = 1;
            }
            else{
                umap[nums[i]] = umap[nums[i]]+1;
            }
        }
         unordered_map<int, int>::iterator it;
        for( it = umap.begin(); it!= umap.end();it++){
            if (k ==0){
                if(it->second >1){
                    count++;
                }
            }
            else{
                int complement = it->first +k;
                if(umap.find(complement) != umap.end()){
                    count++;
                }
            }
        }
        return count;
    }
};