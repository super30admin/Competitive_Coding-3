/*
Time complexity:
O(n)
*/

/*
Space Complexity:
O(n)
*/

/* 
Approach:
First we are creating a frequency map of the given numbers in the array.
Then we look for the 'key + k value' in the hashmap provided k >0.
If it is there then we increment the count by 1. If k = 0 then it means
we need duplicates from the array. For this edge case we look for
any key that has value greater than 1 and if it is there we increment the count
by 1. The advantage of this method is that even if 1+2 =3 or 2+1 = 3, it is going
to look for 3 only once which takes care of the duplicate  pairs.
*/


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        //frequency map
        unordered_map <int, int> store; 

        //storing the array values in the hash map with their frequencies
        for(auto m : nums){
            store[m]++; 
        }
        
        // result count
        int count = 0;

        //logic
        for(auto itr: store){
            if((k == 0 && itr.second > 1 )
            ||( k > 0 && store.count(itr.first + k))) count++;
        }
        
        return count;
        
        
        
    }
};




