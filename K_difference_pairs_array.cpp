// Time Complexity : O(n)
// Space Complexity : O(n) as we are using an extra hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning


// Your code here along with comments explaining your approach

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int size = nums.size() ;
        int result = 0;
        map < int , int> myhash;
        sort(nums.begin(), nums.end());
        if(k < 0)
            return 0;
        for (int i = 0; i< size ; i++){
            while ( i!=0 && i < size&& (nums[i] == nums[i-1])){
                myhash[nums[i]]+=1; // for duplicate values i am increasing count. this will be used when k = 0.
                i++;   
            }
            if ( i < size)
                myhash.insert({nums[i],1});
        }
         for (int i = 0; i< size ; i++){
            while ( i!=0 && i < size &&(nums[i] == nums[i-1])){
                i++;
            }
             if (k !=0 && i < size){ // if i have duplicate values then i am considering number of duplicate values in order to return output for k = 0. because we will consider duplicate values in in this case.
             if(myhash.find(nums[i]+k) != myhash.end()){
                 result+=1;
             }
             } else{
                  if(i <size &&myhash[nums[i]] > 1 ){
                 result+=1;
             }
        }
         }
        return result;
    }
};