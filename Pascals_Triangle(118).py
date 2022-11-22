# Time Complexity : O(N^2)
# Space Complexity : O(N^2)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this : No


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        out = list()
        # add 1 as the first row
        out.append([1])

        for row in range(1,numRows):
            # to store the current row elements
            curr = [1]
            element_index = 1 # we start from index 1 as the 0th index we have already filled 1
            # the current row will have row+1 elements and the last element would be 1
            # so we go till the 2nd last index of the current row
            while element_index < row:
                curr.append(out[row-1][element_index-1]+out[row-1][element_index])
                element_index+=1
            curr.append(1)
            out.append(curr)
        return out