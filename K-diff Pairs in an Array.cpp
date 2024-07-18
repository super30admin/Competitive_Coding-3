// time: O(n)
// space: O(n)

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int result = 0;
        unordered_map <int,int> map;
        for(int i : nums) {
            if(map.find(i) != map.end()) { // found
                if(k == 0) {
                    if(map[i] == 1) {
                        result++;
                    }
                }
            }
            else { // not found
                if(map.find(i+k) != map.end()) {
                    result++;
                }
                if(map.find(i-k) != map.end()) {
                    result++;
                }
            }
            map[i]++;
        }
        return result;
    }
};