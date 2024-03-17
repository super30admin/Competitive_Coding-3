// Time Complexity : O(n) + O(m) == O(n) as n > m
//                       .... n is number of elements in original array
//                       .... m is number of elements hashMap which is nothing but number of
//                            unique elements in original array.
// Space Complexity : O(m) avg. , worst case scenario O(n); when all numbers are unique
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leetcode : https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true
0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
*/

/*
Hash map is used to store the frequency of occurance of each element.

Diff is k i.e. x-y = k; x = k+y (this is condition to search target in hashmap)

If k is given 0, then element to search is element itself; but number should be repeated
at lest twice in the array. e.g. [1, 3, 2, 1, 5, 3] ===> answer is (1,1) and (3,3) here.
Therefore, when search is same then count should be checked for element, if it is more than 1
then only it makes a valid pair.

*/

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map<int, int>hMap;
        int count = 0;

        //Created hashmap to store frequency of occurances of element
        for(int i=0; i<nums.size(); i++){
            if(hMap.find(nums[i]) != hMap.end()){
                hMap[nums[i]]++;
            } else {
                hMap[nums[i]] = 1;
            }
        }

        for(auto &pair : hMap){
            int x = k + pair.first;   // search condition in hashmap
            if(hMap.find(x) != hMap.end()){
                if(x == pair.first){   // this is true when element to search is element itself
                                       // it is possible when k is given 0
                    if(pair.second > 1) count++;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
};