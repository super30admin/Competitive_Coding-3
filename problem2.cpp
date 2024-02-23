// 532. K-diff Pairs in an Array
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
first creates a hashmap to store the frequency of each number in the array. Then, iterates through the hashmap, 
checking for each number if its complement (the number with a difference of k) exists in the hashmap. If found,  
increments the count and decrements the frequency of the complement to avoid counting duplicates. Finally, returns 
the total count of valid pairs.
*/

int findPairs(vector<int>& nums, int k) {
    unordered_map<int, int> iset;
    int n = nums.size(), count = 0;
    for(int i = 0; i < n; i++)
            iset[nums[i]]++;
    for(auto i = iset.begin(); i != iset.end(); i++)
    {
        if(k == 0)
        {
            if(i->second > 1)
            count++;
        }
        else if((iset.find(i->first + k) != iset.end()) && (iset[i->first + k] > 0))
        {
            count++;
            iset[i->first + k] -= 1;
        }
    }
    return count;
}