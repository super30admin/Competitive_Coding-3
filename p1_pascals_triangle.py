class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        """
        Time Complexity: O(n^2)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - we initalized the res array with an array having value 1
            - we start from the second row until numRows 
                - we append 1 as the first element of every row 
                - for the rest of elements of each row we check
                    - if it's the last element we add 1 to the rowList
                    - if not we add element of the previous row at i-1th index and ith index
            - we return the res array 
        """        
        res = [[1]]
        count = 1
        while (count < numRows): #m 
            res.append([1])
            for i in range(1, count+1): #len
                # For last element of each row
                if i == count:
                    res[count].append(1)
                else:
                    ele = res[count-1][i-1] + res[count-1][i]
                    res[count].append(ele)
            count +=1
        return res