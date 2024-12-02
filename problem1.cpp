/*
Time complexity - O(N)
Space complexity - O(N)
*/
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if (nums.size() == 0) return 0;
        unordered_map<int,int> umap;
        int cnt = 0;
        for (int i = 0; i < nums.size(); ++i){
            ++umap[nums[i]];
        }
        for (auto it : umap){
            if (k == 0){
                if (it.second > 1) ++cnt;
            } 
            else if (umap.count(it.first + k) != 0) ++cnt;
        }
        return cnt;
    }
};