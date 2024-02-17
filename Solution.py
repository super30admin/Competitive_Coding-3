class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        [1,3,1,5,4], k = 0
        1 -> 2
        time: O(n)
        space: O(n)
        """
        element_dict = Counter(nums)
        ans = 0
        for n in element_dict:
            if k > 0 and n + k in element_dict:
                ans += 1
            elif k == 0 and element_dict[n] > 1:
                ans += 1
        return ans

    def pascal_triangle(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        time: O(n)
        space: O(n)
        """
        ans = [[1]]
        for i in range(1, numRows):
            # row = []            
            prev_row = ans[-1]
            ans.append([])
            for j in range(i+1):
                if j !=0 and j != i:
                    ans[-1].append(prev_row[j-1] + prev_row[j])
                elif j == 0:
                    ans[-1].append(prev_row[j])
                else:
                    ans[-1].append(prev_row[j-1])
        return ans
         
