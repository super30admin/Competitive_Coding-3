# APPROACH  1: Optimal Solution
# Time Complexity : O(n^2), n: numRows
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. if numRows is 1 return [1] if numRows is 2, return [1, 1]
# 2. Else, each time, create a list. Iterate through elements of previous list and take pair wise sum and add appropiate place of new list
# 3. All the lists have 1 at first and last index. Append these new lists to main result list.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows <= 0:
            return None
        
        result = [[1]]
        if numRows == 1:
            return result
        
        result.append([1, 1])
        prev_ind = 1
        
        while prev_ind + 1 < numRows:
            curr_list = [0 for _ in range(len(result[prev_ind]) + 1)]
            
            curr = 1
            for ind in range(len(result[prev_ind]) - 1):
                curr_list[curr] = result[prev_ind][ind] + result[prev_ind][ind + 1]
                curr += 1
                
            curr_list[0], curr_list[-1] = 1, 1
            
            result.append(curr_list)
            prev_ind += 1
            
        return result
                
            
