// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//118. Pascal's Triangle
class Solution(object): //T.C -> O(N*N) , S.C -> O(N*N)
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        triangle = [[1],[1,1]]

        if numRows == 1:
            return [triangle[0]]
        if numRows == 2:
            return triangle
        
        for i in range(2,numRows):
            new_cell = [1] * (i+1)

            for j in range(1,len(new_cell)-1):
                new_cell[j] = triangle[i-1][j-1] + triangle[i-1][j]
            
            triangle.append(new_cell)
        return triangle

//532. K-diff Pairs in an Array
class Solution(object):
    def findPairs(self, nums, k): //T.C -> O(N) , S.C->O(N)
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #freq hash_map
        hash_map = {}
        count = 0
        visited_element = set()
        for i in range(len(nums)): //O(N)
            if nums[i] in hash_map:
                hash_map[nums[i]] +=1
            else:
                hash_map[nums[i]] = 1
        print(hash_map)
        for num in nums:   //O(N)
            if k == 0 and hash_map[num] > 1:
                if num in visited_element:
                    continue
                else:
                    count+=1
            elif k > 0:
                if num in visited_element:
                    continue
                elif num + k in hash_map:
                    count+=1
            visited_element.add(num)
        return count

               