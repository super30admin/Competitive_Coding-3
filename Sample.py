# Time and space complexicity for each problem are in comments under the function(s)
# Problem 1: Pascal's Traingle

class Solution:

    def generate(self, numRows: int) -> List[List[int]]:

        """
        Description: Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
        
        Approach:
        - Develop a sub-array for each row with all values = 1 (note the begining and end of each row is 1)
        - Replace su-array values from 2nd index to 2nd last index using Pascal's traigle rule
        
        Time Complexicity: O(n^2)
        Space Complexicity: O(n) # for sub_array creation (In addition to resulting list)
        """
        
        if numRows == 0: return []
        
        result = [] 
        for i in range(numRows):
            sub_list = [1]*(i + 1)
            for j in range(1, i):
                sub_list[j] = result[i-1][j-1] + result[i-1][j]
                
            result.append(sub_list)
            
        return result
        
# Problem 2. K diff pairs in an array

class Solution:
    
    def findPairs(self, nums: List[int], k: int) -> int:
        
        """
        Description: Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
        
        Approach: Use a 2-pass solution
        - First Pass: Create a dictionary with frequencies of each element as value and element as key
        - Second Pass: Count if any "key + target" is present in keys from the dictionary
        - Edge case: for k == 0; create a separate pass
        """
        
        if len(nums) == 0: return 0
        num_record = {}
        pair_count = 0

        for num in nums:
            if num in num_record:
                num_record[num] += 1
            else:
                num_record[num] = 1

        if k != 0:
            for key in num_record.keys():
                if key + k in num_record.keys():
                    pair_count += 1
        else:
            for key in num_record.keys():
                if num_record[key] >= 2:
                    pair_count += 1
                    
        return pair_count

