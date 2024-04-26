//Time O(n log n)(parsing the array and sorting time)
//Space O(1)
//Leetcode Yes
//Issue seen: none
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        int i = 0;
        int j = 1;
        int count = 0;
        
        sort(nums.begin(), nums.end());

        while(i < n && j < n){
            if(nums[j] - nums[i] == k && (i != j)) {
                count++;
                i++;
                while(i<n && nums[i-1] == nums[i]){
                    i++;
                }
            } else if((nums[j] - nums[i]) > k && (i < n)){
                i++;    
            } else if(j < n){
                j++;
            }
            
        }
        return count;
    }
};
