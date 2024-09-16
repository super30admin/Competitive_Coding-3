# Time Complexity :
# O(N)  - Size of the List

# Space Complexity :
# O(N) - The hashmaps being created

# Did this code successfully run on Leetcode :
#Yes

#We store the elements in a hashmap. Whenever we see a new element, we check if it's complement exists in the hashmap. If it does, then next it and it's compliment already exist in the answers. If it doesn't then it's added to the answers
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        element_map = {}
        stored_ans = {}
        result = 0
        for elem in nums:
            if (elem + k) in element_map :
                if elem+k in element_map and (elem+k, elem) not in stored_ans and (elem,elem+k) not in stored_ans:
                    stored_ans[(elem+k),(elem)] = '2'
                    stored_ans[(elem),(elem+k)] = '2'
                    result += 1
            if (elem - k) in element_map :
                if elem - k in element_map and (elem-k, elem) not in stored_ans and (elem,elem-k) not in stored_ans:
                    stored_ans[(elem-k),(elem)] = '2'
                    stored_ans[(elem),(elem-k)] = '2'
                    result += 1
                
            element_map[elem] = '1'
        return result
