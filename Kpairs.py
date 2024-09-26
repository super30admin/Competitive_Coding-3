#Time:O(n)
#Space:O(n)
from collections import defaultdict
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #[3,1,4,1,5], k = 2
        #hash map for storing elements
        dict_value = defaultdict(int)
        
        for val in nums:
            if val in dict_value:
                dict_value[val]+=1
            else:
                dict_value[val]=1
                
        #{3:1,1:2,4:1,5:1}
                
        #count returns number of pairs with abs diff k
        count=0
        
        #iterating hashmap for finiding matching pairs
        for key, value in (dict_value.items()):
            if k == 0:
                if key-k in dict_value and dict_value[key-k ]>1 :
                    count+=1
            else:
                if key-k in dict_value:
                    count+=1
        
        return count