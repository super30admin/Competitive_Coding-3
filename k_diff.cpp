// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

/*
In this approach we will use the hashmap for the optimal solution, we will first insert 
all the elements into the hashmap and insert the frequency as values.

now we will iterate through the hashmap and find the key+target value in the hashmap
which is basically the difference. In this approach we will basically always be finding the 
bigger element, from the which the current element will be subtracted will give the 
target.

Now, while iterating through the hashmap, if the target is 0, 2 elements need to
be of the same key(ex,(2,2), 3,3 etc), so for each key we will check if their frequency is
greater than 1, then count++.

If the target is a non zero value, we will be finding the complement of that value in the
hashmap and incrementing the count.

finally return the count.



*/


// Your code here along with comments explaining your approach

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {

        unordered_map<int,int> map;
        int count=0;

        for(int i=0;i<nums.size();i++){
            map[nums[i]]++;

        }

        for(auto p:map){
            if((k==0)&&p.second>1){
                count++;
            }

            if(k!=0 && map.find(k+p.first)!=map.end()){
                count++;
            }
        }

        return count;

        
        
    }
};