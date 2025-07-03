// Time Complexity O(n)
// Space complexity O(n)
class Solution {
public:
int findPairs(vector<int>& nums, int k) {
    if (k < 0) return 0;

    int count = 0;
    
    if (k == 0) {
        unordered_map<int, int> freq;
        for (int num : nums) {
            freq[num]++;
        }
        for (auto& [num, freqCount] : freq) {
            if (freqCount > 1) {
                count++;
            }
        }
    } else {
        unordered_set<int> seen(nums.begin(), nums.end());
        for (int num : seen) {
            if (seen.find(num + k) != seen.end()) {
                count++;
            }
        }
    }

    return count;
}
};